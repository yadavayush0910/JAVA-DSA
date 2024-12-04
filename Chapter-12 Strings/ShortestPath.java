public class ShortestPath {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            
            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // East
            else if (dir == 'E') {
                x++;
            }
            // West
            else {
                x--;
            }
        }
        
        // Calculate the shortest path distance
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        float pathDist = getShortestPath(path);
        System.out.println(pathDist);
    }
}
