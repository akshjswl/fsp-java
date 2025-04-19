class MainThread {
    public static void main(String args[]) {
        Thread ob = Thread.currentThread();  // ✅ get current thread

        System.out.println(ob);              // Prints current thread details

        ob.setName("Ayan");                  // Change thread name
        ob.setPriority(10);                  // Set priority (1 to 10)

        System.out.println(ob);              // Print updated thread info
    }
}
