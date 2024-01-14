package com.broky68.hellomod;

import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.network.chat.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod("hellomod")
@Mod.EventBusSubscriber
public class hellomod {

    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event) {

        Player player = event.getEntity();
        Level level = player.level();

        player.sendSystemMessage(Component.translatable("Hello " + player.getDisplayName().getString() +
                ". You Are From " + (level.isClientSide() ? "Client" : "Server"), Util.NIL_UUID));

    }
}