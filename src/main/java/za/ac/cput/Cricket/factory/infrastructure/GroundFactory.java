package za.ac.cput.Cricket.factory.infrastructure;

import za.ac.cput.Cricket.domain.infrastructure.Ground;

public class GroundFactory {
    public static Ground getGround(int size, int capacity, String groundId)
    {
        return new Ground.Builder()
                .size(size)
                .groundId(groundId)
                .capacity(capacity)
                .Build();
    }
}
