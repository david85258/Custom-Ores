package net.david85258.customores.WorldGen;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

public class OrePopulator extends BlockPopulator {
    public void populate(World world, Random random, Chunk chunk) {
        int X, Y, Z;
        boolean isStone;
        for (int i = 1; i < 15; i++) {  // Number of tries
            if (random.nextInt(100) < 100) {  // The chance of spawning
                X = random.nextInt(15);
                Z = random.nextInt(15);
                Y = random.nextInt(40)+20;  // Get randomized coordinates
                if (world.getBlockAt(X, Y, Z).getType() == Material.STONE) {
                    isStone = true;
                    while (isStone) {
                        world.getBlockAt(X, Y, Z).setType(Material.COAL_ORE);
                        if (random.nextInt(100) < 40)  {   // The chance of continuing the vein
                            switch (random.nextInt(6)) {  // The direction chooser
                                case 0: X++; break;
                                case 1: Y++; break;
                                case 2: Z++; break;
                                case 3: X--; break;
                                case 4: Y--; break;
                                case 5: Z--; break;
                            }
                            isStone = (world.getBlockAt(X, Y, Z).getType() == Material.STONE) && (world.getBlockAt(X, Y, Z).getType() != Material.COAL_ORE);
                        } else isStone = false;
                    }
                }
            }
        }
    }

}
