package com.xworkz.Runner;


import com.xworkz.external.Cadbury;
import com.xworkz.external.Godiva;
import com.xworkz.external.*;

public class MainRunner {
    public static void main(String[] args){
        Movie movie = new Movie("Arasu" ,5,"Thirthahalli");
        movie.toString();
        System.out.println(movie);
        System.out.println("Hash Code");
        movie.hashCode();
        System.out.println(movie);
        movie.setName("Asaru");
        movie.setLocation("Thirthahalli");
        movie.setRating(4);
        Movie movie1 = new Movie("Arasu" ,5,"Thirthahalli");
        movie1.setName("Asaru");
        movie1.setLocation("Thirahalli");
        movie1.setRating(4);

        System.out.println("Compare :"+(movie==movie1));
        boolean hash = movie.equals(movie1);
        System.out.println("Result: "+hash);



        System.out.println("");

        Device device = new Device(45000,"HP","Black");
        System.out.println("Laptop Details: "+device);
        System.out.println("Hash Code");
        Device device2 = new Device(5,"","");
        device2.hashCode();
        System.out.println(device2);
        device.setCompany("HP");
        device.setColor("Blue");
        device.setPrice(45000);

        Device device1 = new Device(5,"","");
        device1.setColor("HP");
        device1.setCompany("Blue");
        device1.setPrice(45000);


        System.out.println("Compare: "+(device==device1));
        boolean equal = device.equals(device2);
        System.out.println(equal);

        System.out.println("");

        Vehicle vehicle = new Vehicle("Red","KIA",1265000,'A');
        System.out.println("Car Details: "+vehicle);
        System.out.println("hash Code");
        System.out.println(vehicle.hashCode());
        vehicle.setColor("Red");
        vehicle.setPrice(1265000);
        vehicle.setCompany("KIA");
        vehicle.setGrade('A');
        Vehicle vehicle1 = new Vehicle("Red","KIA",1265000,'A');
        vehicle1.setGrade('A');
        vehicle1.setPrice(1265000);
        vehicle1.setColor("Red");
        vehicle1.setCompany("KIA");

        System.out.println("Compare :"+(vehicle==vehicle1));
        boolean equal1 = vehicle.equals(vehicle1);
        System.out.println(equal1);



        System.out.println("");
        Hevan hevan = new Hevan(450,"Thirthahalli",'A');
        System.out.println("Thirthahalli Details: "+hevan);
        hevan.setDistance(45);
        hevan.setGrade('A');
        hevan.setPlace("Thirthahalli");
        System.out.println(hevan.hashCode());
        Hevan hevan1 = new Hevan(450,"Thirthahalli",'A');
        hevan1.setPlace("Thirthahalli");
        hevan1.setDistance(45);
        hevan1.setGrade('A');

        System.out.println("Compare: "+(hevan1==hevan));
        boolean equal3 = hevan.equal(hevan1);
        System.out.println(equal3);


        System.out.println("");
        Color color = new Color("Dark Orange",45,"Wall");
        System.out.println("Orange Color Details: "+color);
        System.out.println(color.hashCode());
        Color colo1 = new Color("Dark Orange",45,"Wall");
        System.out.println("Compare the Things: "+colo1.equals(color));
        boolean equals4 = color.equals(colo1);
        System.out.println(equals4);

        System.out.println("");
        Place place = new Place("Shivamogga",60,'A');
        System.out.println("Place Details: "+place);
        System.out.println(place.hashCode());
        Place place1 = new Place("Shivamogga",60,'A');
        System.out.println("Compare Things: "+(place1==place));
        boolean equals5 = place1.equals(place);
        System.out.println(equals5);

        System.out.println("");
        Memory memory = new Memory(1024,"gd",'B');
        System.out.println("Menory Details: "+memory);
        System.out.println(memory.hashCode());
        Memory memory1 = new Memory(1024,"gd",'B');
        System.out.println("Compare Things :"+(memory1==memory));
        boolean equals6 = memory1.equals(memory);
        System.out.println(equals6);

        System.out.println("");
        Material material = new Material("Iron",100250,'c');
        System.out.println("Material Details: "+material);
        System.out.println(material.hashCode());
        Material material1 = new Material("Iron",100250,'c');
        System.out.println("Compare Things: "+(material1== material));
        boolean equals7 = material1.equals(material);
        System.out.println(equals7);

        System.out.println("");
        Wheel wheel = new Wheel("Tyer","Rubber",36);
        System.out.println("Wheel Details: "+wheel);
        System.out.println(wheel.hashCode());
        Wheel wheel1 = new Wheel("Tyer","Rubber",36);
        System.out.println("Compare: "+(wheel1==wheel));
        boolean equal8 = wheel1.equals(wheel);
        System.out.println(equal8);

        System.out.println("");
        Animal animal = new Animal("Dog",15,"Yes");
        System.out.println("Animail Details:" +animal);
        System.out.println(animal.hashCode());
        Animal animal1 = new Animal("Dog",15,"Yes");
        System.out.println("Compare :"+(animal==animal1));
        boolean equal9 = animal.equals(animal1);
        System.out.println(equal9);

        System.out.println("");
        Game game = new Game("Kabadi",11,"Monday");
        System.out.println("Game Details:"+game);
        System.out.println(game.hashCode());
        Game game1 = new Game("Kabadi",11,"Monday");
        System.out.println("Compare: "+(game=game1));
        boolean equal10 =game.equals(game1);
        System.out.println(equal10);

        System.out.println("");
        IndoorGame indoorGame = new IndoorGame("Chess",14,"Tuesday");
        System.out.println("Indoor Game Details: "+indoorGame);
        IndoorGame indoorGame1 = new IndoorGame("Chess",14,"Tuesday");
        System.out.println("Compare :"+(indoorGame==indoorGame1));
        boolean equal11 = indoorGame1.equals(indoorGame);
        System.out.println(equal11);


        System.out.println("");
        mobileGame mobileGame = new mobileGame("Pubg",30,"Wednesday");
        System.out.println("Mobile Game: "+mobileGame);
        System.out.println(mobileGame.hashCode());
        mobileGame mobileGame1 = new mobileGame("Pubg",30,"Wednesday");
        System.out.println("Compare : "+(mobileGame1=mobileGame));
        boolean equal12 = mobileGame1.equals(mobileGame);
        System.out.println("Result :"+equal12);

        System.out.println("");
        PcGame pcGame = new PcGame("Hot Wheels",45,"Thursday");
        System.out.println("PC Game Details: "+pcGame);
        System.out.println(pcGame.hashCode());
        PcGame pcGame1 = new PcGame("Hot Wheels",45,"Thursday");
        System.out.println("Compare :"+(pcGame1==pcGame));
        boolean equals14 = pcGame1.equals(pcGame);
        System.out.println(equals14);

        System.out.println("");
        Tourlment tourlment = new Tourlment("Cricket",15,"Friday");
        System.out.println("Cricket Details: "+tourlment);
        System.out.println(tourlment.hashCode());
        Tourlment tourlment1 = new Tourlment("Cricket",15,"Friday");
        System.out.println("Compare :"+(tourlment1==tourlment));
        boolean equals15 = tourlment1.equals(tourlment);
        System.out.println(equals15);

        System.out.println("");
        Match match = new Match("Hockey",10,"Saturday");
        System.out.println("Match Details: "+match);
        System.out.println(match.hashCode());
        Match match1 = new Match("Hockey",10,"Saturday");
        System.out.println("Compare those Things if both are Siminaral: " +(match1==match));
        boolean equals16 = match.equals(match1);
        System.out.println("Result: "+equals16);

        System.out.println("");
        Song song = new Song("Hunahuna",5,"Koppa");
        System.out.println("Song Details: "+song);
        System.out.println(song.hashCode());
        Song song1 = new Song("Hunahuna",5,"Koppa");
        System.out.println("Compare the Following Things: "+(song1==song));
        boolean equals17 = song1.equals(song);
        System.out.println("Result :"+equals17);


        System.out.println("");
        Manch manch = new Manch("Manch",5,'A');
        System.out.println("Choclate Details: "+manch);
        System.out.println(manch.hashCode());
        Manch manch1 = new Manch("Manch",5,'A');
        System.out.println("Compare This Things: "+(manch1==manch));
        boolean equals18 = manch1.equals(manch);
        System.out.println("Result :"+equals18);


        System.out.println("");
        DiaryMilk diaryMilk = new DiaryMilk("Diary MIlk",10,'A');
        System.out.println("Choclate Details: "+diaryMilk);
        System.out.println(diaryMilk.hashCode());
        DiaryMilk diaryMilk1 = new DiaryMilk("Diary MIlk",10,'A');
        System.out.println("Compare This Iteams: "+(diaryMilk1==diaryMilk));
        boolean equals19 = diaryMilk1.equals(diaryMilk);
        System.out.println("Result: "+equals19);

        System.out.println("");
        Dark dark = new Dark("Dark",1,'A');
        System.out.println("Choclate Details: "+dark);
        System.out.println(dark.hashCode());
        Dark dark1 = new Dark("Dark",1,'A');
        System.out.println("Compare :"+(dark1==dark));
        boolean equals20 = dark1.equals(dark);
        System.out.println("Result: "+equals20);


        System.out.println("");
        FiveStar fiveStar = new FiveStar("FiveStar",20,'A');
        System.out.println("Choclate Details: "+fiveStar);
        System.out.println(fiveStar.hashCode());
        FiveStar fiveStar1 = new FiveStar("FiveStar",20,'A');
        System.out.println("Compare :"+(fiveStar1==fiveStar));
        boolean same12 = fiveStar1.equals(fiveStar);
        System.out.println("Result: "+same12);


        System.out.println("");
        MilkyBar milkyBar = new MilkyBar("Milky-Bar",10,'A');
        System.out.println("Choclate Details :"+milkyBar);
        System.out.println(milkyBar.hashCode());
        MilkyBar milkyBar1 = new MilkyBar("Milky-Bar",10,'A');
        System.out.println("Compare: "+(milkyBar1==milkyBar));
        boolean same13 = milkyBar1.equals(milkyBar);
        System.out.println("Result :"+same13);


        System.out.println("");
        KinderJoy kinderJoy = new KinderJoy("Kinder Joy",30,'C');
        System.out.println("Choclate Details: "+kinderJoy);
        System.out.println(kinderJoy.hashCode());
        KinderJoy kinderJoy1 = new KinderJoy("Kinder Joy",30,'C');
        System.out.println("Compare: "+(kinderJoy1==kinderJoy));
        boolean same14 = kinderJoy.equals(kinderJoy1);
        System.out.println("Result :"+same14);

        System.out.println("");
        Kitkat kitkat = new Kitkat("Kitkat",5,'A');
        System.out.println("Choclate Details: "+kitkat);
        System.out.println(kitkat.hashCode());
        Kitkat kitkat1 = new Kitkat("Kitkat",5,'A');
        System.out.println("Compare :"+(kitkat1==kitkat));
        boolean same15 = kitkat.equals(kitkat1);
        System.out.println("Result :"+same15);

        System.out.println("");
        Puls puls = new Puls("Puls",5,'C');
        System.out.println("Choclate Details: "+puls);
        System.out.println(puls.hashCode());
        Puls puls1 = new Puls("Puls",5,'C');
        System.out.println("Compare :"+(puls1==puls));
        boolean same16 = puls.equals(puls1);
        System.out.println("Result :"+same16);


        System.out.println("");
        KachaMango kachaMango = new KachaMango("Kacha Mango Byte",1,'A');
        System.out.println("Choclate Details: "+kachaMango);
        System.out.println(kachaMango.hashCode());
        KachaMango kachaMango1 = new KachaMango("Kacha Mango Byte",1,'A');
        System.out.println("Compare: "+(kachaMango1==kachaMango));
        boolean same17 = kachaMango.equals(kachaMango1);
        System.out.println("Result: "+same17);


        System.out.println("");
        Ferrero ferrero = new Ferrero("Ferrero",70,'A');
        System.out.println("Choclate Details: "+ferrero);
        System.out.println(ferrero.hashCode());
        Ferrero ferrero1 = new Ferrero("Ferrero",70,'A');
        System.out.println("Compare: "+(ferrero1==ferrero));
        boolean same18 = ferrero1.equals(ferrero);
        System.out.println("Result :"+(ferrero1==ferrero));


        System.out.println("");
        Milka milka = new Milka("Milka",100,'A');
        System.out.println("Choclate Details: "+milka);
        System.out.println(milka.hashCode());
        Milka milka1 = new Milka("Milka",100,'A');
        System.out.println("Compare: "+(milka1==milka));
        boolean same19 = milka1.equals(milka);
        System.out.println("Result :"+milka1.equals(milka));


        System.out.println("");
        Lindt lindt = new Lindt("Lindt",120,'A');
        System.out.println("Choclate Details: "+lindt);
        System.out.println(lindt.hashCode());
        Lindt lindt1 = new Lindt("Lindt",120,'A');
        System.out.println("Compare :"+(lindt1==lindt));
        boolean same20 = lindt1.equals(lindt);
        System.out.println("Result :"+same20);


        System.out.println("");
        Richart richart = new Richart("Richart",80,'A');
        System.out.println("Choclate Details: "+richart);
        System.out.println(richart.hashCode());
        Richart richart1 = new Richart("Richart",80,'A');
        System.out.println("Compare :"+(richart1==richart));
        boolean same31 = richart1.equals(richart);
        System.out.println("Result :"+same31);


        System.out.println("");
        Nestle nestle = new Nestle("Nestle",45,'A');
        System.out.println("Choclate Details: "+nestle);
        System.out.println(nestle.hashCode());
        Nestle nestle1 = new Nestle("Nestle",45,'A');
        System.out.println("Compare :"+(nestle1==nestle));
        boolean same41 = nestle1.equals(nestle);
        System.out.println("Result: "+same41);


        System.out.println("");
        Valrhona valrhona = new Valrhona("Valrhona",500,'A');
        System.out.println("Choclate Details: "+valrhona);
        System.out.println(valrhona.hashCode());
        Valrhona valrhona1 = new Valrhona("Valrhona",500,'A');
        System.out.println("Compare :"+(valrhona1==valrhona));
        boolean same51 = valrhona1.equals(valrhona);
        System.out.println("Result: "+same51);


        System.out.println("");
        Godiva godiva = new Godiva("Godiva",500,'B');
        System.out.println("Choclate Details: "+godiva);
        System.out.println(godiva.hashCode());
        Godiva godiva1 = new Godiva("Godiva",500,'B');
        System.out.println("Compare the This: "+(godiva1==godiva));
        boolean same61 = godiva1.equals(godiva);
        System.out.println("Result: "+same61);


        System.out.println("");
        Amul amul = new Amul("Amul",45,'c');
        System.out.println("Choclate Details: "+amul);
        System.out.println(amul.hashCode());
        Amul amul1 = new Amul("Amul",45,'c');
        System.out.println("Compare: "+(amul1==amul));
        boolean same71 = amul1.equals(amul);
        System.out.println("Result: "+same71);

        System.out.println("");
        Ghirardelli ghirardelli = new Ghirardelli("Ghirardelli",5,'A');
        System.out.println("Choclate Details: "+ghirardelli);
        System.out.println(ghirardelli.hashCode());
        Ghirardelli ghirardelli1 = new Ghirardelli("Ghirardelli",5,'A');
        System.out.println("Compare :"+(ghirardelli==ghirardelli1));
        boolean same81 = ghirardelli1.equals(ghirardelli);
        System.out.println("Result :"+same81);

        System.out.println("");
        Cadbury cadbury = new Cadbury("Casbury",45,'A');
        System.out.println("Choclate Details: "+cadbury);
        System.out.println(cadbury.hashCode());
        Cadbury cadbury1 = new Cadbury("Casbury",45,'A');
        System.out.println("Compare :"+(cadbury1=cadbury));
        boolean same22=cadbury1.equals(cadbury);
        System.out.println("Result :"+same22);

        System.out.println("");
        MilkChocolate milkChocolate = new MilkChocolate("Milkchoclate",45,'A');
        System.out.println("Choclate Details :"+milkChocolate);
        System.out.println(milkChocolate.hashCode());
        MilkChocolate milkChocolate1 = new MilkChocolate("Milkchoclate",45,'A');
        System.out.println("Compare: "+(milkChocolate1==milkChocolate));
        boolean same33 =milkChocolate1.equals(milkChocolate);
        System.out.println("Result: "+same33);

        System.out.println("");
        WhiteChocolate whiteChocolate = new WhiteChocolate("White Choclate",52,'A');
        System.out.println("Choclate Details: "+whiteChocolate);
        System.out.println(whiteChocolate.hashCode());
        WhiteChocolate whiteChocolate1 = new WhiteChocolate("White Choclate",52,'A');
        System.out.println("Compare This Things: "+(whiteChocolate1==whiteChocolate));
        boolean same44 = whiteChocolate1.equals(whiteChocolate);

        System.out.println("");
        CocoaPowder cocoaPowder = new CocoaPowder("Cocoa Power",25,'C');
        System.out.println("Choclate Details: "+cocoaPowder);
        System.out.println(cocoaPowder.hashCode());
        CocoaPowder cocoaPowder1 = new CocoaPowder("Cocoa Power",25,'C');
        System.out.println("Compare This Things: "+(cocoaPowder1==cocoaPowder));
        boolean same55= cocoaPowder1.equals(cocoaPowder);
        System.out.println("Result: "+same55);

        System.out.println("");
        BittersweetChocolate bittersweetChocolate = new BittersweetChocolate("Bitter Sweet Choclate",75,'A');
        System.out.println("Choclate Details: "+bittersweetChocolate);
        System.out.println(bittersweetChocolate.hashCode());
        BittersweetChocolate bittersweetChocolate1 = new BittersweetChocolate("Bitter Sweet Choclate",75,'A');
        System.out.println("Compare of the Things: "+(bittersweetChocolate1==bittersweetChocolate));
        boolean same66 = bittersweetChocolate1.equals(bittersweetChocolate);
        System.out.println("Result: "+same66);

        System.out.println("");
        Arun arun = new Arun("Arun",21,'A');
        System.out.println("Student Details: "+arun);
        System.out.println(arun.hashCode());
        Arun arun1 = new Arun("Arun",21,'A');
        boolean student1 = arun1.equals(arun);
        System.out.println(student1);

        System.out.println("");
        Amith amith = new Amith("Amith",24,'A');
        System.out.println("Student Details: "+amith);
        System.out.println(amith.hashCode());
        Amith amith1 = new Amith("Amith",24,'A');
        System.out.println("Compare: "+(amith1==amith));
        boolean student2 = amith1.equals(amith);
        System.out.println("Result: "+student2);

        System.out.println("");
        Abhi abhi = new Abhi("Abhi",27,'A');
        System.out.println("Student Details: "+abhi);
        System.out.println(abhi.hashCode());
        Abhi abhi1 = new Abhi("Abhi",27,'A');
        System.out.println("Compare: "+(abhi==abhi1));
        boolean student3 = abhi1.equals(abhi);
        System.out.println("Result: "+student3);

        System.out.println("");
        Aakhil aakhil = new Aakhil("Aahkil",25,'B');
        System.out.println("Student Details: "+aakhil);
        System.out.println(aakhil.hashCode());
        Aakhil aakhil1 = new Aakhil("Aahkil",25,'B');
        System.out.println("Compare: "+(aakhil1==aakhil));
        boolean student4 = aakhil1.equals(aakhil);
        System.out.println("Result: "+student4);

        System.out.println("");
        Adash adash = new Adash("Adash",30,'A');
        System.out.println("Student Details: "+adash);
        System.out.println(adash.hashCode());
        Adash adash1 = new Adash("Adash",30,'A');
        System.out.println("Compare: "+(adash1==adash));
        boolean student5 = adash1.equals(adash);
        System.out.println("Result: "+student5);

        System.out.println("");
        Adhithya adhithya = new Adhithya("Adhithya",23,'B');
        System.out.println(adhithya);
        System.out.println(adhithya.hashCode());
        Adhithya adhithya1 = new Adhithya("Adhithya",23,'B');
        System.out.println("Compare :"+(adhithya==adhithya1));
        boolean student6 = adhithya1.equals(adhithya);
        System.out.println("Result: "+student6);

        System.out.println("");
        Avinik avinik = new Avinik("Avinik",21,'c');
        System.out.println("Student Details: "+avinik);
        System.out.println(avinik.hashCode());
        Avinik avinik1 = new Avinik("Avinik",21,'c');
        System.out.println("Compare: "+(avinik1==avinik));
        boolean student7 = avinik1.equals(avinik);
        System.out.println("Result: "+student7);

        System.out.println("");
        Abhijith abhijith = new Abhijith("Abhijith",25,'D');
        System.out.println("Student Details: "+abhijith);
        System.out.println(abhijith.hashCode());
        Abhijith abhijith1 = new Abhijith("Abhijith",25,'D');
        System.out.println("Compare: "+(abhijith1==abhijith));
        boolean student8 = abhijith1.equals(abhijith);
        System.out.println("Result: "+student8);

        System.out.println("");
        Anvith anvith = new Anvith("Anvith",19,'A');
        System.out.println("Student Details: "+anvith);
        System.out.println(avinik.hashCode());
        Anvith anvith1 = new Anvith("Anvith",19,'A');
        System.out.println("Compare: "+(anvith1==anvith));
        boolean student9 = anvith.equals(anvith1);
        System.out.println("Result: "+student9);

        System.out.println("");
        Anvitha anvitha = new Anvitha("Anvitha",22,'A');
        System.out.println("Student Details: "+anvitha);
        System.out.println(anvitha.hashCode());
        Anvitha anvitha1 = new Anvitha("Anvitha",22,'A');
        System.out.println("Compare: "+(anvitha1==anvitha));
        boolean student10 = anvith.equals(anvitha1);
        System.out.println("Result: "+student10);

        System.out.println("");
        Aniketh aniketh = new Aniketh("Aniketh",23,'A');
        System.out.println("Student Details: "+aniketh);
        System.out.println(aniketh.hashCode());
        Aniketh aniketh1 = new Aniketh("Aniketh",23,'A');
        System.out.println("Compare: "+(aniketh1==aniketh));
        boolean student11 = aniketh1.equals(aniketh);
        System.out.println("result: "+student11);

        System.out.println("");
        Adhya adhya = new Adhya("Adhya",23,'A');
        System.out.println("Student Details: "+adhya);
        System.out.println(adhya.hashCode());
        Adhya adhya1 = new Adhya("Adhya",23,'A');
        System.out.println("Compare: "+(adhya1==adhya));
        boolean student12 = adhya.equals(adhya1);
        System.out.println("Result: "+student12);

        System.out.println("");
        Azeem azeem = new Azeem("Azeem",19,'A');
        System.out.println("Student Details: "+azeem);
        System.out.println(azeem.hashCode());
        Azeem azeem1 = new Azeem("Azeem",19,'A');
        System.out.println("Compare: "+(azeem1==azeem));
        boolean student13 = azeem1.equals(azeem);
        System.out.println("Result: "+student13);

        System.out.println("");
        Bhargav bhargav = new Bhargav("Bhargav",22,'A');
        System.out.println("Student Details: "+bhargav);
        System.out.println(bhargav.hashCode());
        Bhargav bhargav1 = new Bhargav("Bhargav",22,'A');
        System.out.println("Compare The Things: "+(bhargav1==bhargav));
        boolean student14 = bhargav1.equals(bhargav);

        System.out.println("");
        Bharath bharath = new Bharath("Bharath",26,'A');
        System.out.println("Student Details: "+bharath);
        System.out.println(bharath.hashCode());
        Bharath bharath1 = new Bharath("Bharath",26,'A');
        System.out.println("Compare: "+(bharath==bharath1));
        boolean student15= bharath1.equals(bharath);

        System.out.println("");
        Bhavanth bhavanth = new Bhavanth("Bhavanth",25,'B');
        System.out.println("Student Details: "+bhavanth);
        System.out.println(bhavanth.hashCode());
        Bhavanth bhavanth1 = new Bhavanth("Bhavanth",25,'B');
        System.out.println("Compare: "+(bhavanth==bhavanth1));
        boolean student16 = bhavanth1.equals(bhavanth);
        System.out.println("Result: "+student16);

        System.out.println("");
        Bharathwaj bharathwaj = new Bharathwaj("Bharathwaj",26,'A');
        System.out.println("Student Details :"+bharathwaj);
        System.out.println(bharathwaj.hashCode());
        Bharathwaj bharathwaj1 = new Bharathwaj("Bharathwaj",26,'A');
        System.out.println("Compare: "+(bharathwaj1==bharathwaj));
        boolean student17 = bharathwaj1.equals(bharathwaj);

        System.out.println("");
        Bhargavi bhargavi = new Bhargavi("Bhargavi",23,'A');
        System.out.println("Student Details: "+bhargavi);
        System.out.println(bhargavi.hashCode());
        Bhargavi bhargavi1 = new Bhargavi("Bhargavi",23,'A');
        System.out.println("Compare: "+(bhargavi1==bhargavi));
        boolean student18 = bhargavi.equals(bhargavi);
        System.out.println(student18);

        System.out.println("");
        Charan charan = new Charan("Charan",12,'A');
        System.out.println("Student Details: "+charan);
        System.out.println(charan.hashCode());
        Charan charan1 = new Charan("Charan",12,'A');
        System.out.println("Campare the Things: ");
        boolean student19 = charan.equals(charan);
        System.out.println("Result: "+student19);

        System.out.println("");
        Chandrushekar chandrushekar = new Chandrushekar("Chandrushekar",23,'B');
        System.out.println("Student details: "+chandrushekar);
        System.out.println(chandrushekar.hashCode());

        System.out.println("");
        Charith chirath = new Charith("Chiranth",23,'A');
        System.out.println("Student Details: "+chirath);
        System.out.println(chirath.hashCode());

        System.out.println("");
        Chirag chirag = new Chirag("Chirag",23,'A');
        System.out.println("Student Details: "+chirag);
        System.out.println(chirag.hashCode());

        System.out.println("");
        Charith charith = new Charith("Charith",25,'A');
        System.out.println("Student Details: "+charith);
        System.out.println(charith.hashCode());

        System.out.println("");
        Dhanush dhanush = new Dhanush("Dhanush",24,'A');
        System.out.println("Student Details: "+dhanush);
        System.out.println(dhanush.hashCode());

        System.out.println("");
        Dhanya dhanya = new Dhanya("Dhanya",23,'A');
        System.out.println("Student Details: "+dhanya);
        System.out.println(dhanya.hashCode());

        System.out.println("");
        Dhinesh dhinesh = new Dhinesh("Dhinesh",23,'A');
        System.out.println("Student Details: "+dhinesh);
        System.out.println(dhinesh.hashCode());

        System.out.println("");
        Dharshan dharshan = new Dharshan("Dharshan",12,'A');
        System.out.println("Student Deatils :"+dharshan);
        System.out.println(dharshan.hashCode());

        System.out.println("");
        Dharshu dharshu = new Dharshu("Dharshu",15,'A');
        System.out.println("Student Details: "+dharshu);
        System.out.println(dhanush);

        System.out.println("");
        Devu devu = new Devu("Devu",13,'A');
        System.out.println("Student details: "+devu);
        System.out.println(devu.hashCode());

        System.out.println("");
        Divakar divakar = new Divakar("Divakar",29,'A');
        System.out.println("Student Details: "+divakar);
        System.out.println(divakar.hashCode());

        System.out.println("");
        David david = new David("David",15,'A');
        System.out.println("Student Details: "+david);
        System.out.println(david.hashCode());

        System.out.println("");
        Deelip deelip = new Deelip("Deelip",29,'B');
        System.out.println("Student Details: "+deelip);
        System.out.println(deelip.hashCode());

        System.out.println("");
        Deeraj deeraj = new Deeraj("Deeraj",27,'A');
        System.out.println("Student Details: "+deeraj);
        System.out.println(deeraj.hashCode());

        System.out.println("");
        Balu balu = new Balu("Balu",24,'A');
        System.out.println("Student Details: "+balu);
        System.out.println(balu.hashCode());
        Balu balu1 = new Balu("Balu",24,'A');
        System.out.println("Compare: "+(balu1==balu));
        boolean student20 = balu1.equals(balu);
        System.out.println("Result: "+student20);

        System.out.println("");
        Esa esa = new Esa("Esa",26,'A');
        System.out.println("Student Details: "+esa);
        System.out.println(esa.hashCode());

        System.out.println("");
        Eshanya eshanya = new Eshanya("Eshanya T K",18,'A');
        System.out.println("Student Details: "+eshanya);
        System.out.println(eshanya.hashCode());

        System.out.println("");
        Eshan eshan = new Eshan("Eshan",21,'A');
        System.out.println("Student Details: "+eshan);
        System.out.println(eshan.hashCode());

        System.out.println("");
        Eshani eshani = new Eshani("Eshani",24,'B');
        System.out.println("Student Details: "+eshani);
        System.out.println(eshani.hashCode());

        System.out.println("");
        Eswar eswar = new Eswar("Eswar",25,'A');
        System.out.println("Student Details: "+eswar);
        System.out.println(eswar.hashCode());

        System.out.println("");
        FaranKhan faranKhan = new FaranKhan("Faran kkan",27,'A');
        System.out.println("Student Details: "+faranKhan);
        System.out.println(faranKhan.hashCode());

        System.out.println("");
        Faruk faruk = new Faruk("Faruk",28,'A');
        System.out.println("Student Details: "+faruk);
        System.out.println(faruk.hashCode());

        System.out.println("");
        Gowtham gowtham = new Gowtham("Gowtham",18,'A');
        System.out.println("Student Details: "+gowtham);
        System.out.println(gowtham.hashCode());

        System.out.println("");
        goosper Goosper = new goosper("Goosper",15,'C');
        System.out.println("Student Details: "+Goosper);
        System.out.println(Goosper.hashCode());

        System.out.println("");
        Gopinath gopinath = new Gopinath("Gopinath",23,'A');
        System.out.println("Student Details: "+gopinath);
        System.out.println(gopinath.hashCode());

        System.out.println("");
        Gokul gokul = new Gokul("Gokul",30,'A');
        System.out.println("Student Details: "+gokul);
        System.out.println(gokul.hashCode());


        System.out.println("");
        Gowthami gowthami = new Gowthami("Gowthami",31,'A');
        System.out.println("Student Details: "+gowthami);
        System.out.println(gowthami.hashCode());

        System.out.println("");
        Harsha harsha = new Harsha("Harsh",23,'A');
        System.out.println("Student Details: "+harsha);
        System.out.println(harsha.hashCode());

        System.out.println("");
         Harshith harshith = new Harshith("Harshith",15,'A');
        System.out.println("Student Details: "+harshith);
        System.out.println(harshith.hashCode());

        System.out.println("");
        Harshitha harshitha = new Harshitha("Harshitha",27,'A');
        System.out.println("Student Details: "+harshitha);
        System.out.println(harshitha.hashCode());

        System.out.println("");
        Harshad harshad = new Harshad("Harshad",15,'A');
        System.out.println("Student Details: "+harshad);
        System.out.println(harshad.hashCode());

        System.out.println("");
        Harish harish = new Harish("Harish",20,'A');
        System.out.println("Student Details: "+harish);
        System.out.println(harish.hashCode());

        System.out.println("");
        Imaz imaz = new Imaz("Imaz",21,'A');
        System.out.println("Student Details: "+imaz);
        System.out.println(imaz.hashCode());
        Imaz imaz1 = new Imaz("Imaz",21,'A');
        System.out.println("Compare: "+(imaz1==imaz));
        boolean studennt54=imaz1.equals(imaz);
        System.out.println("Result: "+studennt54);



        System.out.println("");
        Jagath jagath = new Jagath("Jagath",23,'A');
        System.out.println("Student Details: "+jagath);
        System.out.println(jagath.hashCode());
        Jagath jagath1 = new Jagath("Jagath",23,'A');
        System.out.println("Compare: "+(jagath==jagath1));
        boolean student55 = jagath.equals(jagath);
        System.out.println("Result: "+student55);


        System.out.println("");
        Kiran kiran = new Kiran("Kiran",28,'A');
        System.out.println("Student Details: "+kiran);
        System.out.println(kiran.hashCode());
        Kiran kiran1 = new Kiran("Kiran",28,'A');
        System.out.println("Compare the Things: "+(kiran1==kiran));
        boolean student56 = kiran1.equals(kiran);

        System.out.println("");
        Karan karan = new Karan("Karan",29,'B');
        System.out.println("Student Details: "+karan);
        System.out.println(karan.hashCode());
        Karan karan1 = new Karan("Karan",29,'B');
        System.out.println("Compare: "+(karan==karan1));
        boolean student55 = karan.equals(karan1);
        System.out.println("Result: "+student55);

        System.out.println("");
        Kowstubha kowstubha =new Kowstubha("Kowstubha",23,'A');
        System.out.println("Student Details: "+kowstubha);
        System.out.println(kowstubha.hashCode());
        Kowstubha kowstubha1 =new Kowstubha("Kowstubha",23,'A');
        System.out.println("Compare: "+(kowstubha1==kowstubha));
        boolean student54 = kowstubha1.equals(kowstubha);
        System.out.println("Result: "+student54);

        System.out.println("");
        Kishor kishor = new Kishor("Kishor",35,'C');
        System.out.println("Student Details: "+kishor);
        System.out.println(kishor.hashCode());
        Kishor kishor1 = new Kishor("Kishor",35,'C');
        System.out.println("Compare the Thigs: "+(kishor1==kishor));
        boolean student52=kishor1.equals(kishor);
        System.out.println("Result: "+student52);

        System.out.println("");
        Kruthi kruthi = new Kruthi("Kruthi",26,'A');
        System.out.println("Student Details: "+kruthi);
        System.out.println(kruthi.hashCode());
        Kruthi kruthi1 = new Kruthi("Kruthi",26,'A');
        System.out.println("Compare The Things: "+(kruthi1==kruthi));
        boolean student51 = kruthi1.equals(kruthi);
        System.out.println("Result: "+student51);

        System.out.println("");
        Kushal kushal = new Kushal("Kushal",15,'A');
        System.out.println("Student Details: "+kushal);
        System.out.println(kushal.hashCode());
        Kushal kushal1 = new Kushal("Kushal",15,'A');
        System.out.println("Compare: "+(kushal1==kushal));
        boolean student50 = kushal.equals(kushal1);
        System.out.println("Result: "+student50);
        Kushal kushal2 = new Kushal("Kushal",15,'B');
        System.out.println("Compare: "+(kushal1==kushal2));
        boolean student45 = kushal.equals(kushal1);
        System.out.println("Result: "+student45);





















    }
}
