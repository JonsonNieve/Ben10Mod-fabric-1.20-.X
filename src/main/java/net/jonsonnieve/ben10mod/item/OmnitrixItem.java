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
            isActivated = !isActivated;
            nbt.putBoolean("isActivated", isActivated);

            playerEntity.playSound(ModSounds.OMNITRIX_SOUND_EVENT, 1.0F, 1.0F);

            return TypedActionResult.success(playerEntity.getStackInHand(hand));
        }

        return TypedActionResult.pass(playerEntity.getStackInHand(hand));
    }
}
