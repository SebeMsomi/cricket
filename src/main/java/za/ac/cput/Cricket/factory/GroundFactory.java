package za.ac.cput.Cricket.factory;

import za.ac.cput.Cricket.domain.Ground;

public class GroundFactory {
    public static Ground getGround(int size, int capacity)
    {
        return new Ground.Builder()
                .size(size)
                .capacity(capacity)
                .Build();
    }
}
