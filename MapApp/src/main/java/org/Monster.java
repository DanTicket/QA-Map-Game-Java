public class Monster {
    private int x;
    private int y;

    private static Random random = new Random(); // Random instance

    public Monster(int maxX, int maxY) {
        this.x = random.nextInt(maxX + 1);
        this.y = random.nextInt(maxY + 1);
    }
    public int[] getLocation() {
        return new int[]{x, y};
    }

    public void greeting() {
        System.out.println("Monster at (" + x + ", " + y + "): Hello, adventurer!");
    }

}
