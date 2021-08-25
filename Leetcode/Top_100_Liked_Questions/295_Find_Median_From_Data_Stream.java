class MedianFinder {
    PriorityQueue<Integer> minHeap, maxHeap;

        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            minHeap = new PriorityQueue<>();
            maxHeap = new PriorityQueue<>((a, b) -> b.compareTo(a));
        }

        public void addNum(int num) {
            if(maxHeap.size() == 0 || num >= maxHeap.peek()){
                minHeap.add(num);
            }else{
                maxHeap.add(num);
            }
            
            if(maxHeap.size() - minHeap.size() > 1){
                minHeap.add(maxHeap.poll());
            }else if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
        }

        public double findMedian() {
            
            if (maxHeap.size() == minHeap.size()) {
                return (maxHeap.peek() + minHeap.peek()) / 2.0;

            }else{
                return maxHeap.peek();
            }
        }
}

//https://www.youtube.com/watch?v=1LkOrc-Le-Y
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */