package com.example.avaritiaironsbridge.mixin;

import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = LocalPlayer.class, priority = 5000)
public class AvaritiaShieldMixin {

    @Inject(
        method = "aiStep()V", 
        at = @At(
            value = "INVOKE", 
            target = "Lnet/minecraft/client/player/LocalPlayer;isUsingItem()Z", 
            shift = At.Shift.AFTER
        ), 
        cancellable = true
    )
    private void bridge$avaritiaShieldDoesNotSlowMovement(CallbackInfo ci) {
        // Safe alternative logic placeholder if needed
    }
}
