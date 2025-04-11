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
        movie.


        System.out.println("");

        Device device = new Device(45000,"HP","Black");
        System.out.println("Laptop Details: "+device);
        System.out.println("Hash Code");
        Device device1 = new Device(5,"","");
        device1.hashCode();
        System.out.println(device1);


        System.out.println("");

        Vehicle vehicle = new Vehicle("Red","KIA",1265000,'A');
        System.out.println("Car Details: "+vehicle);
        System.out.println("hash Code");
        System.out.println(vehicle.hashCode());


        System.out.println("");
        Hevan hevan = new Hevan(450,"Thirthahalli",'A');
        System.out.println("Thirthahalli Details: "+hevan);
        System.out.println(hevan.hashCode());

        System.out.println("");
        Color color = new Color("Dark Orange",45,"Wall");
        System.out.println("Orange Color Details: "+color);
        System.out.println(color.hashCode());

        System.out.println("");
        Place place = new Place("Shivamogga",60,'A');
        System.out.println("Place Details: "+place);
        System.out.println(place.hashCode());

        System.out.println("");
        Memory memory = new Memory(1024,"gd",'B');
        System.out.println("Menory Details: "+memory);
        System.out.println(memory.hashCode());

        System.out.println("");
        Material material = new Material("Iron",100250,'c');
        System.out.println("Material Details: "+material);
        System.out.println(material.hashCode());

        System.out.println("");
        Wheel wheel = new Wheel("Tyer","Rubber",36);
        System.out.println("Wheel Details: "+wheel);
        System.out.println(wheel.hashCode());

        System.out.println("");
        Animal animal = new Animal("Dog",15,"Yes");
        System.out.println("Animail Details:" +animal);
        System.out.println(animal.hashCode());

        System.out.println("");
        Game game = new Game("Kabadi",11,"Monday");
        System.out.println("Game Details:"+game);
        System.out.println(game.hashCode());

        System.out.println("");
        IndoorGame indoorGame = new IndoorGame("Chess",14,"Tuesday");
        System.out.println("Indoor Game Details: "+indoorGame);

        System.out.println("");
        mobileGame mobileGame = new mobileGame("Pubg",30,"Wednesday");
        System.out.println("Mobile Game: "+mobileGame);
        System.out.println(mobileGame.hashCode());

        System.out.println("");
        PcGame pcGame = new PcGame("Hot Wheels",45,"Thursday");
        System.out.println("PC Game Details: "+pcGame);
        System.out.println(pcGame.hashCode());

        System.out.println("");
        Tourlment tourlment = new Tourlment("Cricket",15,"Friday");
        System.out.println("Cricket Details: "+tourlment);
        System.out.println(tourlment.hashCode());

        System.out.println("");
        Match match = new Match("Hockey",10,"Saturday");
        System.out.println("Match Details: "+match);
        System.out.println(match.hashCode());

        System.out.println("");
        Song song = new Song("Hunahuna",5,"Koppa");
        System.out.println("Song Details: "+song);
        System.out.println(song.hashCode());

        System.out.println("");
        Manch manch = new Manch("Manch",5,'A');
        System.out.println("Choclate Details: "+manch);
        System.out.println(manch.hashCode());

        System.out.println("");
        DiaryMilk diaryMilk = new DiaryMilk("Diary MIlk",10,'A');
        System.out.println("Choclate Details: "+diaryMilk);
        System.out.println(diaryMilk.hashCode());

        System.out.println("");
        Dark dark = new Dark("Dark",1,'A');
        System.out.println("Choclate Details: "+dark);
        System.out.println(dark.hashCode());

        System.out.println("");
        FiveStar fiveStar = new FiveStar("FiveStar",20,'A');
        System.out.println("Choclate Details: "+fiveStar);
        System.out.println(fiveStar.hashCode());

        System.out.println("");
        MilkyBar milkyBar = new MilkyBar("Milky-Bar",10,'A');
        System.out.println("Choclate Details :"+milkyBar);
        System.out.println(milkyBar.hashCode());

        System.out.println("");
        KinderJoy kinderJoy = new KinderJoy("Kinder Joy",30,'C');
        System.out.println("Choclate Details: "+kinderJoy);
        System.out.println(kinderJoy.hashCode());

        System.out.println("");
        Kitkat kitkat = new Kitkat("Kitkat",5,'A');
        System.out.println("Choclate Details: "+kitkat);
        System.out.println(kitkat.hashCode());

        System.out.println("");
        Puls puls = new Puls("Puls",5,'C');
        System.out.println("Choclate Details: "+puls);
        System.out.println(puls.hashCode());

        System.out.println("");
        KachaMango kachaMango = new KachaMango("Kacha Mango Byte",1,'A');
        System.out.println("Choclate Details: "+kachaMango);
        System.out.println(kachaMango.hashCode());

        System.out.println("");
        Ferrero ferrero = new Ferrero("Ferrero",70,'A');
        System.out.println("Choclate Details: "+ferrero);
        System.out.println(ferrero.hashCode());

        System.out.println("");
        Milka milka = new Milka("Milka",100,'A');
        System.out.println("Choclate Details: "+milka);
        System.out.println(milka.hashCode());

        System.out.println("");
        Lindt lindt = new Lindt("Lindt",120,'A');
        System.out.println("Choclate Details: "+lindt);
        System.out.println(lindt.hashCode());

        System.out.println("");
        Richart richart = new Richart("Richart",80,'A');
        System.out.println("Choclate Details: "+richart);
        System.out.println(richart.hashCode());

        System.out.println("");
        Nestle nestle = new Nestle("Nestle",45,'A');
        System.out.println("Choclate Details: "+nestle);
        System.out.println(nestle.hashCode());

        System.out.println("");
        Valrhona valrhona = new Valrhona("Valrhona",500,'A');
        System.out.println("Choclate Details: "+valrhona);
        System.out.println(valrhona.hashCode());

        System.out.println("");
        Godiva godiva = new Godiva("Godiva",500,'B');
        System.out.println("Choclate Details: "+godiva);
        System.out.println(godiva.hashCode());

        System.out.println("");
        Amul amul = new Amul("Amul",45,'c');
        System.out.println("Choclate Details: "+amul);
        System.out.println(amul.hashCode());

        System.out.println("");
        Ghirardelli ghirardelli = new Ghirardelli("Ghirardelli",5,'A');
        System.out.println("Choclate Details: "+ghirardelli);
        System.out.println(ghirardelli.hashCode());

        System.out.println("");
        Cadbury cadbury = new Cadbury("Casbury",45,'A');
        System.out.println("Choclate Details: "+cadbury);
        System.out.println(cadbury.hashCode());

        System.out.println("");
        MilkChocolate milkChocolate = new MilkChocolate("Milkchoclate",45,'A');
        System.out.println("Choclate Details :"+milkChocolate);
        System.out.println(milkChocolate.hashCode());

        System.out.println("");
        WhiteChocolate whiteChocolate = new WhiteChocolate("White Choclate",52,'A');
        System.out.println("Choclate Details: "+whiteChocolate);
        System.out.println(whiteChocolate.hashCode());

        System.out.println("");
        CocoaPowder cocoaPowder = new CocoaPowder("Cocoa Power",25,'C');
        System.out.println("Choclate Details: "+cocoaPowder);
        System.out.println(cocoaPowder.hashCode());

        System.out.println("");
        BittersweetChocolate bittersweetChocolate = new BittersweetChocolate("Bitter Sweet Choclate",75,'A');
        System.out.println("Choclate Details: "+bittersweetChocolate);
        System.out.println(bittersweetChocolate.hashCode());

        System.out.println("");
        Arun arun = new Arun("Arun",21,'A');
        System.out.println("Student Details: "+arun);
        System.out.println(arun.hashCode());

        System.out.println("");
        Amith amith = new Amith("Amith",24,'A');
        System.out.println("Student Details: "+amith);
        System.out.println(amith.hashCode());

        System.out.println("");
        Abhi abhi = new Abhi("Abhi",27,'A');
        System.out.println("Student Details: "+abhi);
        System.out.println(abhi.hashCode());

        System.out.println("");
        Aakhil aakhil = new Aakhil("Aahkil",25,'B');
        System.out.println("Student Details: "+aakhil);
        System.out.println(aakhil.hashCode());

        System.out.println("");
        Adash adash = new Adash("Adash",30,'A');
        System.out.println("Student Details: "+adash);
        System.out.println(adash.hashCode());

        System.out.println("");
        Adhithya adhithya = new Adhithya("Adhithya",23,'B');
        System.out.println(adhithya);
        System.out.println(adhithya.hashCode());

        System.out.println("");
        Avinik avinik = new Avinik("Avinik",21,'c');
        System.out.println("Student Details: "+avinik);
        System.out.println(avinik.hashCode());

        System.out.println("");
        Abhijith abhijith = new Abhijith("Abhijith",25,'D');
        System.out.println("Student Details: "+abhijith);
        System.out.println(abhijith.hashCode());

        System.out.println("");
        Anvith anvith = new Anvith("Anvith",19,'A');
        System.out.println("Student Details: "+anvith);
        System.out.println(avinik.hashCode());

        System.out.println("");
        Anvitha anvitha = new Anvitha("Anvitha",22,'A');
        System.out.println("Student Details: "+anvitha);
        System.out.println(anvitha.hashCode());

        System.out.println("");
        Anisha anisha = new Anisha("Anisha",22,'A');
        System.out.println("Student Details: "+anisha);
        System.out.println(anisha.hashCode());

        System.out.println("");
        Aniketh aniketh = new Aniketh("Aniketh",23,'A');
        System.out.println("Student Details: "+aniketh);
        System.out.println(aniketh.hashCode());

        System.out.println("");
        Adhya adhya = new Adhya("Adhya",23,'A');
        System.out.println("Student Details: "+adhya);
        System.out.println(adhya.hashCode());

        System.out.println("");
        Azeem azeem = new Azeem("Azeem",19,'A');
        System.out.println("Student Details: "+azeem);
        System.out.println(azeem.hashCode());

        System.out.println("");
        Bhargav bhargav = new Bhargav("Bhargav",22,'A');
        System.out.println("Student Details: "+bhargav);
        System.out.println(bhargav.hashCode());

        System.out.println("");
        Bharath bharath = new Bharath("Bharath",26,'A');
        System.out.println("Student Details: "+bharath);
        System.out.println(bharath.hashCode());

        System.out.println("");
        Bhavanth bhavanth = new Bhavanth("Bhavanth",25,'B');
        System.out.println("Student Details: "+bhavanth);
        System.out.println(bhavanth.hashCode());

        System.out.println("");
        Bharathwaj bharathwaj = new Bharathwaj("Bharathwaj",26,'A');
        System.out.println("Student Details :"+bharathwaj);
        System.out.println(bharathwaj.hashCode());

        System.out.println("");
        Bhargavi bhargavi = new Bhargavi("Bhargavi",23,'A');
        System.out.println("Student Details: "+bhargavi);
        System.out.println(bhargavi.hashCode());

        System.out.println("");
        Charan charan = new Charan("Charan",12,'A');
        System.out.println("Student Details: "+charan);
        System.out.println(charan.hashCode());

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

        System.out.println("");
        Jagath jagath = new Jagath("Jagath",23,'A');
        System.out.println("Student Details: "+jagath);
        System.out.println(jagath.hashCode());

        System.out.println("");
        Kiran kiran = new Kiran("Kiran",28,'A');
        System.out.println("Student Details: "+kiran);
        System.out.println(kiran.hashCode());

        System.out.println("");
        Karan karan = new Karan("Karan",29,'B');
        System.out.println("Student Details: "+karan);
        System.out.println(karan.hashCode())
        ;
        System.out.println("");
        Kowstubha kowstubha =new Kowstubha("Kowstubha",23,'A');
        System.out.println("Student Details: "+kowstubha);
        System.out.println(kowstubha.hashCode());

        System.out.println("");
        Kishor kishor = new Kishor("Kishor",35,'C');
        System.out.println("Student Details: "+kishor);
        System.out.println(kishor.hashCode());

        System.out.println("");
        Kruthi kruthi = new Kruthi("Kruthi",26,'A');
        System.out.println("Student Details: "+kruthi);
        System.out.println(kruthi.hashCode());

        System.out.println("");
        Kushal kushal = new Kushal("Kushal",15,'A');
        System.out.println("Student Details: "+kushal);
        System.out.println(kushal.hashCode());

        System.out.println("");
        Krushik krushik = new Krushik("Krushik",34,'A');
        System.out.println("Student Details: "+krushik);
        System.out.println(krushik.hashCode());


















    }
}
