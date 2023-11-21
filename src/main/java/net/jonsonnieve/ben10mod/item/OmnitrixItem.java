package net.jonsonnieve.ben10mod.item;

import net.jonsonnieve.ben10mod.Ben10Mod;
import net.jonsonnieve.ben10mod.util.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import static net.jonsonnieve.ben10mod.util.ModHUDMessagesHelper.GREEN_TEXT_STYLE;
import static net.jonsonnieve.ben10mod.util.ModHUDMessagesHelper.showMessage;

public class OmnitrixItem extends Item {
    public OmnitrixItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if(playerEntity.getOffHandStack().getItem() instanceof OmnitrixItem){
            ItemStack stack = playerEntity.getStackInHand(hand);

            NbtCompound nbt = stack.getOrCreateNbt();
            boolean isActivated = nbt.getBoolean("isActivated");


            if(!isActivated) {
                playerEntity.playSound(ModSounds.OMNITRIX_ACTIVATED_SOUND_EVENT, 1.0F, 1.0F);
                showMessage(playerEntity, Ben10Mod.getCurrentAlien(), GREEN_TEXT_STYLE, true);

            }
            else{
                playerEntity.playSound(ModSounds.OMNITRIX_TRANSFORM_SOUND_EVENT, 1.0F, 1.0F);
            }

            isActivated = !isActivated;
            nbt.putBoolean("isActivated", isActivated);
        }

        return TypedActionResult.pass(playerEntity.getStackInHand(hand));
    }
}
