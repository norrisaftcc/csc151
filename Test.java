
import java.io.*;
import java.util.Scanner;

// By implementing Serializable interface
// we make sure that state of instances of class DogStepTracker
// can be saved in a file.
class DogStepTracker implements Serializable {
    private static final long serialVersionUID = 1L;
    
    int steps;
    String dogName;
    String dogBreed;
    String owner;

    // DogStepTracker class constructor
    public DogStepTracker(int steps, String dogName, String dogBreed, String owner) {
        this.steps = steps;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.owner = owner;
    }
}

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO: get all the info

        /*
        int steps = 100;
        String dogName = "Esther";
        String dogBreed = "Lab Mix";
        String owner = "norrisa";
        */
        // Ask the User to type the info
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");
        int steps = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter the dog's name: ");
        String dogName = scanner.nextLine();

        System.out.print("Enter the dog's breed: ");
        String dogBreed = scanner.nextLine();

        System.out.print("Enter the owner's name: ");
        String owner = scanner.nextLine();
        // cleanup
        scanner.close();

        // Make the object
        DogStepTracker tracker = new DogStepTracker(steps, dogName, dogBreed, owner);
        // Write it to a file
        System.out.println("Writing file...");
        // Serializing 'tracker'
        FileOutputStream fos = new FileOutputStream("dog_tracker.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tracker);

        // De-serializing 'tracker'
        FileInputStream fis = new FileInputStream("dog_tracker.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        DogStepTracker deserializedTracker = (DogStepTracker) ois.readObject(); // down-casting object
        System.out.println("Reading file...");
        System.out.println("Dog Name: " + deserializedTracker.dogName + ", Steps: " + deserializedTracker.steps);
        System.out.println("Dog Breed: " + deserializedTracker.dogBreed);
        System.out.println("Owner: " + deserializedTracker.owner);
        // TODO: print all the other data 
        // closing streams
        oos.close();
        ois.close();
    }
}


