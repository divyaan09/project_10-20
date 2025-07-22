# 🛡️ Safe Chat App (Local, Simple XOR Encryption)

A beginner-friendly Java console application that demonstrates a basic secure chat mechanism using XOR encryption. This project simulates a secure text-based communication between two users (User A and User B) on the same system.

---

## 🔧 Features

- 🔐 **Basic XOR encryption** for encrypting and decrypting messages.
- 👥 **Two-way communication** simulation between User A and User B.
- 🖥️ **Console-based interface**, ideal for beginners in Java.
- 🧪 **Educational use** only (not suitable for real-world security needs).

---

## 📁 File Structure

```
SafeChatApp/
├── SafeChatApp.java      # Main Java source code
├── README.md             # Project documentation
```

---

## 🚀 Getting Started

### 📌 Prerequisites

- Java JDK 8 or later installed
- Any text editor or IDE (e.g., VS Code, IntelliJ)

### 🛠️ Compilation & Running

```bash
javac SafeChatApp.java
java SafeChatApp
```

---

## 💬 How It Works

1. The user is prompted to enter a **shared secret key** (a single character).
2. Choose who will send the message (User A or B).
3. The message is encrypted using XOR encryption and displayed.
4. The encrypted message is then decrypted and shown to the other user.

---

## 🧪 Sample Output

```
===== SAFE CHAT APP =====
Enter a shared secret key (single character): x

--- Menu ---
1. User A sends message
2. User B sends message
3. Exit
Choose option: 1
User A: Enter your message: Hello
Encrypted: 0x1F1C1C1B
User B receives (Decrypted): Hello
```

---

## ⚠️ Disclaimer

This project uses XOR encryption which is **not secure** for real-world applications. It is purely for **learning and demonstration** purposes.

---

## 📜 License

This project is open-source and free to use for educational purposes.# project_10-20
