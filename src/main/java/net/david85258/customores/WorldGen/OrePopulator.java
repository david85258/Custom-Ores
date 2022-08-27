package net.david85258.customores.WorldGen;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.LimitedRegion;
import org.bukkit.generator.WorldInfo;

import java.util.Random;

@SuppressWarnings("NullableProblems")
public class OrePopulator extends BlockPopulator {

    /*public void populate(World world, Random random, Chunk chunk) {
        int X, Y, Z;
        for (int i = 1; i < 15; i++) {  // Number of tries
            if (random.nextInt(1000) < 5) {  // The chance of spawning
                X = random.nextInt(16);
                Z = random.nextInt(16);
                Y = random.nextInt(103)-63;  // Get randomized coordinates
                if (chunk.getBlock(X, Y, Z).getType() == Material.STONE) {
                    chunk.getBlock(X, Y, Z).setType(Material.CHEST);
                }
            }
        }
    }*/

    @Override
    public void populate(WorldInfo worldInfo, Random random, int x, int z, LimitedRegion limitedRegion) {
        super.populate(worldInfo, random, x, z, limitedRegion);
        int X, Y, Z;
        for (int i = 1; i < 15; i++){
            X = x * 16 + random.nextInt(16);
            Z = z * 16 + random.nextInt(16);
            Y = random.nextInt(103)-63;
            if (limitedRegion.getType(X,Y,Z) == Material.STONE){
                limitedRegion.setType(X,Y,Z,Material.CHEST);
            }
        }
    }
}
