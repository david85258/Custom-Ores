package net.david85258.customores.WorldGen;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

public class OrePopulator extends BlockPopulator {
    public void populate(World world, Random random, Chunk chunk) {
        int X, Y, Z;
        for (int i = 1; i < 15; i++) {  // Number of tries
            if (random.nextInt(1000) < 5) {  // The chance of spawning
                X = random.nextInt(15);
                Z = random.nextInt(15);
                Y = random.nextInt(103)-63;  // Get randomized coordinates
                if (world.getBlockAt(X, Y, Z).getType() == Material.STONE) {
                    world.getBlockAt(X, Y, Z).setType(Material.CHEST);
                }
            }
        }
    }

}
