
import java.util.*;

class InstagramAccount {

    String name;
    long followers;
    String platform;

    InstagramAccount(String name, long followers, String platform) {
        this.name = name;
        this.followers = followers;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return name + ": " + followers + " followers";
    }

    public String getDetails() {
        return "Account Name: " + name + "\nFollowers: " + followers + "\nPlatform: " + platform;
    }
}

public class SocialmediaAnalyse {

    public static void main(String[] args) {
        // Define the Instagram data as a String array
        String[] data = {
            "Instagram, 539446645, 7202, Instagram",
            "Cristiano Ronaldo, 473864939, 3338, Instagram",
            "Kylie ❤️, 364542529, 6935, Instagram",
            "Leo Messi, 355790796, 890, Instagram",
            "Selena Gomez, 341579063, 1828, Instagram",
            "Dwayne Johnson, 333221596, 6738, Instagram",
            "Kim Kardashian, 328323322, 5598, Instagram",
            "Ariana Grande, 326473270, 4963, Instagram",
            "Beyoncé, 272211534, 2037, Instagram",
            "Khloé Kardashian, 267912338, 4104, Instagram",
            "Justin Bieber, 253285832, 7330, Instagram",
            "Kendall, 252632221, 674, Instagram",
            "National Geographic, 236500488, 27045, Instagram",
            "Nike, 233371786, 948, Instagram",
            "Taylor Swift, 221732794, 536, Instagram",
            "Jennifer Lopez, 220169794, 3126, Instagram",
            "Virat Kohli, 211074078, 1405, Instagram",
            "Barbie, 201394982, 6343, Instagram",
            "Kourtney Kardashian Barker ❤️‍🔥, 194512673, 4352, Instagram",
            "Miley Cyrus, 180959274, 1181, Instagram",
            "NJ 🇮🇳, 176935982, 5271, Instagram",
            "KATY PERRY, 169597869, 2047, Instagram",
            "Kevin Hart, 151581146, 8211, Instagram",
            "Zendaya, 150280418, 3540, Instagram",
            "Demi Lovato, 138781881, 47, Instagram",
            "badgalriri, 135053892, 4837, Instagram",
            "👑, 130398630, 2344, Instagram",
            "Ellen DeGeneres, 124943799, 10549, Instagram",
            "Real Madrid C.F., 123177126, 6815, Instagram",
            "champagnepapi, 119117889, 5212, Instagram",
            "BREEZY, 117994690, 7322, Instagram",
            "FC Barcelona, 111257233, 16952, Instagram",
            "BILLIE EILISH, 105134435, 695, Instagram",
            "UEFA Champions League, 96634213, 17942, Instagram",
            "DUA LIPA, 85756579, 1259, Instagram",
            "Gal Gadot, 85305143, 1684, Instagram",
            "Vin Diesel, 82187552, 1824, Instagram",
            "NASA, 81215401, 3563, Instagram",
            "Priyanka, 80986405, 3530, Instagram",
            "LISA, 80723426, 868, Instagram",
            "Khaby Lame, 78697857, 291, Instagram",
            "Shakira, 76041310, 1989, Instagram",
            "snoopdogg, 75284700, 54207, Instagram",
            "Gigi Hadid, 75207736, 3253, Instagram",
            "David Beckham, 74912255, 1537, Instagram",
            "Shraddha ✨, 73878089, 1875, Instagram",
            "Victoria's Secret, 73190174, 2861, Instagram",
            "Kylian Mbappé, 72705315, 1155, Instagram",
            "Neha Kakkar (Mrs. Singh), 70404564, 2286, Instagram",
            "NBA, 69922564, 50977, Instagram",
            "Shawn Mendes, 69887832, 2534, Instagram",
            "Narendra Modi, 68816270, 540, Instagram",
            "J, 68733032, 860, Instagram",
            "Alia Bhatt ❤️☀️, 68517743, 1833, Instagram",
            "Deepika Padukone, 68295084, 275, Instagram",
            "Tom Holland, 67722305, 1218, Instagram",
            "Ronaldo de Assis Moreira, 67646939, 2959, Instagram",
            "Emma Watson, 67296368, 345, Instagram",
            "BTS official, 66769961, 1092, Instagram",
            "Katrina Kaif, 66186703, 1005, Instagram",
            "Marvel Entertainment, 66083072, 7055, Instagram",
            "Justin Timberlake, 65817755, 784, Instagram",
            "camila, 64887038, 2888, Instagram",
            "Will Smith, 63991832, 1365, Instagram",
            "Raffi Ahmad and Nagita Slavina, 63437657, 17509, Instagram",
            "Anitta 🎤, 63122857, 5135, Instagram",
            "MALUMA, 62858032, 8135, Instagram",
            "Akshay Kumar, 62777257, 1881, Instagram",
            "JISOO❤️, 62683010, 829, Instagram",
            "Jacqueline Fernandez, 62637438, 2443, Instagram",
            "Paris Saint-Germain, 61860116, 9867, Instagram",
            "ROSE, 61660597, 818, Instagram",
            "Manchester United, 59520626, 22777, Instagram",
            "AnushkaSharma1588, 59477707, 1165, Instagram",
            "Whindersson Nunes, 58718833, 2734, Instagram",
            "Premier League, 58541952, 19991, Instagram",
            "9GAG: Go Fun The World, 58125945, 30005, Instagram",
            "Marcelo Vieira, 57970008, 2695, Instagram",
            "Millie Bobby Brown, 57350069, 299, Instagram",
            "Karim Benzema, 56760930, 2023, Instagram",
            "Chris Hemsworth, 55866652, 851, Instagram",
            "KAROL G, 55413300, 3296, Instagram",
            "Paul Labile Pogba, 55138512, 1302, Instagram",
            "Zlatan Ibrahimovic, 55048835, 875, Instagram",
            "Leonardo DiCaprio, 54518260, 1689, Instagram",
            "Juventus, 54472637, 12633, Instagram",
            "Zac Efron, 54434089, 666, Instagram",
            "Bella 🦋, 54034924, 3152, Instagram",
            "Urvashi Rautela, 53812411, 3396, Instagram",
            "Tata Werneck, 53806580, 5583, Instagram",
            "Salman Khan, 53372896, 1176, Instagram",
            "Robert Downey Jr. Official, 53368184, 425, Instagram",
            "Sunny Leone, 53326932, 4575, Instagram",
            "Lady Gaga, 53211167, 3559, Instagram",
            "disha patani (paatni) 🦋, 52855261, 2137, Instagram",
            "J Balvin, 52776655, 13063, Instagram",
            "Sergio Ramos, 52708281, 2228, Instagram",
            "ZARA Official, 52498150, 3756, Instagram",
            "Mohamed Salah, 52422831, 841, Instagram"
        };

        // Create a list to store InstagramAccount objects
        List<InstagramAccount> accounts = new ArrayList<>();

        // Parse the data into InstagramAccount objects
        for (String entry : data) {
            String[] parts = entry.split(",");
            String name = parts[0].trim();
            long followers = Long.parseLong(parts[1].trim());
            String platform = parts[3].trim();
            accounts.add(new InstagramAccount(name, followers, platform));
        }

        // Sort the accounts by the number of followers in descending order
        accounts.sort((a, b) -> Long.compare(b.followers, a.followers));

        try ( // Create a scanner object for user input
                Scanner scanner = new Scanner(System.in)) {
            int option;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Show top n Instagram accounts");
                System.out.println("2. Show account details by name");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                option = scanner.nextInt();
                scanner.nextLine();  // Consume the newline

                switch (option) {
                    case 1 -> {
                        // Get user input for the number of top accounts to display
                        System.out.print("Enter the number of top Instagram accounts to display: ");
                        int n = scanner.nextInt();
                        // Ensure n is not greater than the number of available accounts
                        if (n > accounts.size()) {
                            System.out.println("There are only " + accounts.size() + " Instagram accounts available.");
                            n = accounts.size();
                        }

                        // Display the top n Instagram accounts
                        System.out.println("Top " + n + " Instagram Accounts by Followers:");
                        for (int i = 0; i < n; i++) {
                            System.out.println(accounts.get(i));
                        }
                    }

                    case 2 -> {
                        // Show account details by name
                        System.out.print("Enter the name of the Instagram account: ");
                        String inputName = scanner.nextLine().trim().toLowerCase(); // Normalize input

                        boolean found = false;
                        for (String line : data) {
                            // Extract account name and compare
                            String accountName = line.split(",")[0].trim().toLowerCase(); // Normalize name in data
                            if (accountName.contains(inputName)) {  // Case-insensitive search
                                found = true;
                                String[] details = line.split(",");
                                System.out.println("Account Name: " + details[0].trim());
                                System.out.println("Followers: " + details[1].trim());
                                System.out.println("Posts: " + details[2].trim());
                                System.out.println("Platform: " + details[3].trim());
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Account with the name '" + inputName + "' not found.");
                        }
                    }

                    case 3 ->
                        System.out.println("Exiting...");

                    default ->
                        System.out.println("Invalid option. Please try again.");
                }
            } while (option != 3); // Loop until the user chooses to exit
            // Close the scanner
        }
    }
}
