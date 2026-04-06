import java.util.*;

class EventManager {

    PriorityQueue<int[]> maxheap;
    HashMap<Integer, Integer> map;

    public EventManager(int[][] events) {
        map = new HashMap<>();

        maxheap = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return b[1] - a[1];
        });

        for (int[] e : events) {
            map.put(e[0], e[1]);
            maxheap.add(new int[]{e[0], e[1]});
        }
    }

    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId, newPriority);
        maxheap.add(new int[]{eventId, newPriority});
    }

    public int pollHighest() {
        while (!maxheap.isEmpty()) {
            int[] top = maxheap.poll();
            int id = top[0];
            int pr = top[1];

            if (map.containsKey(id) && map.get(id) == pr) {
                map.remove(id);
                return id;
            }
        }
        return -1;
    }
}