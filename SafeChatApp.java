import java.util.Scanner;

public class SafeChatApp {
    private static final Scanner scanner = new Scanner(System.in);

    // XOR Encrypt/Decrypt method
    public static String xorEncryptDecrypt(String message, char key) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            result.append((char) (c ^ key));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("===== SAFE CHAT APP =====");
        System.out.print("Enter a shared secret key (single character): ");
        char key = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. User A sends message");
            System.out.println("2. User B sends message");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("User A: Enter your message: ");
                    String msgA = scanner.nextLine();
                    String encryptedA = xorEncryptDecrypt(msgA, key);
                    System.out.println("Encrypted: " + encryptedA);
                    System.out.println("User B receives (Decrypted): " + xorEncryptDecrypt(encryptedA, key));
                    break;

                case 2:
                    System.out.print("User B: Enter your message: ");
                    String msgB = scanner.nextLine();
                    String encryptedB = xorEncryptDecrypt(msgB, key);
                    System.out.println("Encrypted: " + encryptedB);
                    System.out.println("User A receives (Decrypted): " + xorEncryptDecrypt(encryptedB, key));
                    break;

                case 3:
                    System.out.println("Exiting chat...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
