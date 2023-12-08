package me.charass.tin3o.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.time.Instant;

@Mixin(ServerPlayNetworkHandler.class)
public class SPNHInject {
    @Inject(method = "isInProperOrder", at = @At("HEAD"), cancellable = true)
    public void isInProperOrder(Instant timestamp, @NotNull CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
