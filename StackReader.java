public class StackReader {
    public static void main(String[] args) {
        FileIO reader = new FileIO();
        FixedSizeStack stack = new FixedSizeStack();
        String[] commands = reader.load("C:\\Users\\ayomi\\Downloads\\CS210 LAB\\Stacks.txt"); // Reading the File as a String array
        
        for (String commandLine : commands) {
            String command = commandLine.trim();
            if (command.startsWith("PUSH")) {
                String item = command.substring(5); // Get the string after "PUSH "
                stack.push(item);
            } else if (command.equals("POP")) {
                stack.pop();
            }
        }

        // Output the result of peeking at the stack after all commands are processed
        String peekResult = stack.peek();
        System.out.println("Peek result: " + peekResult);
    }
}