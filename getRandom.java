import java.util.Random;

public class getRandom {
    public static String jr(Random random) {
        String[] jrs = {
                "Time and Space Jr",
                "Fire and Ice Jr",
                "Year Jr",
                "People Jr",
                "Mr. Jr",
                "Day Jr",
                "Man Jr",
                "Thing Jr",
                "Woman Jr",
                "Life Jr",
                "Child Jr",
                "World Jr",
                "School Jr",
                "State Jr",
                "Family Jr",
                "Student Jr",
                "Group Jr",
                "Country Jr",
                "Problem Jr",
                "Hand Jr",
                "Part Jr",
                "Place Jr",
                "Case Jr",
                "Week Jr",
                "Company Jr",
                "System Jr",
                "Program Jr",
                "Question Jr",
                "Work Jr",
                "Government Jr",
                "Number Jr",
                "Night Jr",
                "Point Jr",
                "Home Jr",
                "Water Jr",
                "Room Jr",
                "Mother Jr",
                "Area Jr",
                "Money Jr",
                "Story Jr",
                "Fact Jr",
                "Month Jr",
                "Parking lot Jr",
                "Right Jr",
                "Study Jr",
                "Book Jr",
                "Eye Jr",
                "Job Jr",
                "Word Jr",
                "Business Jr",
                "Issue Jr",
                "Side Jr",
                "Kind Jr",
                "Head Jr",
                "House Jr",
                "Service Jr",
                "Friend Jr",
                "Father Jr",
                "Power Jr",
                "Hour Jr",
                "Game Jr",
                "Line Jr",
                "End Jr",
                "Member Jr",
                "Law Jr",
                "Car Jr",
                "City Jr",
                "Community Jr",
                "Name Jr",
                "President Jr",
                "Team Jr",
                "Minute Jr",
                "Idea Jr",
                "Kid Jr",
                "Body Jr",
                "Information Jr",
                "Back Jr",
                "Parent Jr",
                "Face Jr",
                "Others Jr",
                "Level Jr",
                "Office Jr",
                "Door Jr",
                "Health Jr",
                "Person Jr",
                "Art Jr",
                "War Jr",
                "History Jr",
                "Party Jr",
                "Result Jr",
                "Change Jr",
                "Morning Jr",
                "Reason Jr",
                "Research Jr",
                "Girl Jr",
                "Guy Jr",
                "Moment Jr",
                "Movement Jr",
                "Air Jr",
                "Teacher Jr",
                "Force Jr",
                "Education Jr",
                "Backjack Jr",
                "BedTime Jr",
                "Homework Jr",
                "Bumblegorp Jr",
                "Prayer Jr",
                "Child of Christ Jr",
                "Cheese and crackers Jr",
                "javascript.Jr",
                "Youtube Jr",
                "CSGO Jr",
                "Emilio Jr",
                "Videogame Jr",
                "VC Jr",
                "Sephiroth Jr",
                "Budlight Jr",
                "Apple Sauce Jr",
                "Alfredo Jr",
                "Deez Nutz Jr",
                "Hop on one leg Jr",
                "Charleston Jr",
                "Pizza Jr",
                "Rock and a hardplace Jr",
                "Practice makes perfect Jr",
                "Fingernail Jr",
                "Baron Jr",
                "Sopping Wet Sock Jr",
                "I stepped in street milk Jr",
                "f(x) = 2x^2 + 5x + 3 Jr",
                "C:\\Program Files (x86)\\Homework Jr",
                "Benzos Jr",
                "Pavement Jr",
                "Pink Eye Jr",
                "Pepperoni Jr",
                "Jackson Peavy Jr",
                "random.nextInt(jrs.length) Jr",
                "Tyler The Jr",
                "Bookbag Jr",
                "Hearts of Iron Jr",
                "Pickle Ball Jr",
                "Squidward Jr (RIP)",
                "Simon Says Jr",
                "Light Fixture Jr",
                "Florence Darlington Technical College Jr",
                "Locked in Jr",
                "Tweaking Jr",
                "Nathan Drake Jr",
                "Walmart Jr",
                "Costco Jr",
                "Target Jr",
                "Moth Ball Jr",
                "Henny Jr",
                "Spencer J Garland Jr",
                "Discord Jr",
                "The Rot Jr",
                "Alphabet Jr",
                "Dream Jr",
                "Vision Jr",
                "Adventure Jr",
                "Wonder Jr",
                "Discovery Jr",
                "Journey Jr",
                "Exploration Jr",
                "Mystery Jr",
                "Magic Jr",
                "Fantasy Jr",
                "Quest Jr",
                "Challenge Jr",
                "Infinity Jr",
                "Universe Jr",
                "Cosmos Jr",
                "Galaxy Jr",
                "Star Jr",
                "Constellation Jr",
                "Planet Jr",
                "Moon Jr",
                "Sun Jr",
                "Astronaut Jr",
                "Rocket Jr",
                "Spacecraft Jr",
                "Alien Jr",
                "Martian Jr",
                "Moonwalker Jr",
                "Comet Jr",
                "Meteor Jr",
                "Nebula Jr",
                "Black Hole Jr",
                "Supernova Jr",
                "Solar Jr",
                "Lunar Jr",
                "Earth Jr",
                "Mars Jr",
                "Venus Jr",
                "Jupiter Jr",
                "Saturn Jr",
                "Neptune Jr",
                "Uranus Jr",
                "Pluto Jr",
                "Mercury Jr",
                "Galactic Jr",
                "Interstellar Jr",
                "Time Travel Jr",
                "Einstein Jr",
                "Newton Jr",
                "Tesla Jr",
                "Edison Jr",
                "Hawking Jr",
                "Curiosity Jr",
                "Imagination Jr",
                "Innovation Jr",
                "Creativity Jr",
                "Ingenuity Jr",
                "Bravery Jr",
                "Courage Jr",
                "Hero Jr",
                "Legend Jr",
                "Myth Jr",
                "Fable Jr",
                "Tale Jr",
                "Saga Jr",
                "Epic Jr",
                "Storyteller Jr",
                "Bard Jr",
                "Minstrel Jr",
                "Poet Jr",
                "Scribe Jr",
                "Wordsmith Jr",
                "Author Jr",
                "Writer Jr",
                "Literature Jr",
                "Library Jr",
                "Verse Jr",
                "Ballad Jr",
                "Folklore Jr",
                "Fairytale Jr",
                "Mythology Jr",
                "Explorer Jr",
                "Heroine Jr",
                "Villainess Jr",
                "Wizard Jr",
                "Sorcerer Jr",
                "Magician Jr",
                "Enchanter Jr",
                "Alchemist Jr",
                "Conjurer Jr",
                "Summoner Jr",
                "Spellcaster Jr",
                "Witch Jr",
                "Warlock Jr",
                "Druid Jr",
                "Shaman Jr",
                "Necromancer Jr",
                "Sorceress Jr",
                "Enchantress Jr",
                "Illusionist Jr",
                "Charmer Jr",
                "Potion Maker Jr",
                "Magic User Jr",
                "Sorcery Jr",
                "Witchcraft Jr",
                "Alchemy Jr",
                "Enchantment Jr",
                "Spells Jr",
                "Potions Jr",
                "Magical Jr",
                "Mystical Jr",
                "Fantastical Jr",
                "Whimsical Jr",
                "Enchanted Jr",
                "Legendary Jr",
                "Mythical Jr",
                "Mystery Jr",
                "Limerick Jr",
                "Haiku Jr",
                "Sonnet Jr",
                "Rhythm Jr",
                "Rhyme Jr",
                "Prose Jr",
                "Chapter Jr",
                "Page Jr",
                "Bookshelf Jr",
                "Adventurer Jr",
                "Heroin Jr",
                "Crack Rock Jr",
                "Acid Jr",
                "Drugs",
                "Molly Jr",
                "K Jr",
                "Fetty Jr",
                "Black Tar Heroin",
                "Chat GPT Jr",
                "Sonic Jr",
                "Shadow Jr",
                "Tails Jr",
                "Knuckles Jr",
                "Kick Jr",
                "Punch Jr",
                "Smack Jr",
                "Pinch Jr",
                "Tickle Jr",
                "Smooch Jr",
                "Kill Jr",
                "Destroy Jr",
                "Roast Jr",
                "Broil Jr",
                "Crumple Jr",
                "Catch Jr",
                "Chase Jr",
                "Hunt Jr",
                "Deepfry Jr",
                "Discover Jr",
                "Sneopard Sbug",
                "Broth Moth",
                "Sneopard Sbug Broth Moth",
                "Mrs. Chandler",
                "Jackson Randolph Peavy",
                "Cooper Abbot",
                "Sara Summerfield",
                "Laura Palmer",
                "Chuck Norris",
                "Audrey Pope",
                "Diego",
                "JT Dunphy",
                "Mrs. Hardee",
                "Harold Dilbourn",
                "Dr. Swinny-Carter",
                "Mr. Redfearn",
                "Aiden",
                "Super Linneen",
                "David Mark Taylor Jr",
                "Old McDonald Jr",
                "Cow Jr",
                "Piggie Jr",
                "Mark Ruffalo Jr",
                "Cheese and Crackers Jr",
                "Davis Ivey Jr",
                "Yevi Sivad Jr",
                "Jeremy Ironman Jr",
                "Lola Bunny Jr",
                "Bart Simpson Jr",
                "Roger the Alien Jr",
                "Keyboard Jr",
                "Controller Jr",
                "Melee Jr",
                "Big Scary Monster Jr",
                "Christian Jr",
                "Jesus Lover Jr",
                "The straight edge Vegan",
                "Cheeseburger Joe",
                "Quinoa Phillip"
        };
        return jrs[random.nextInt(jrs.length)];

    }

    public static String affirmation(Random random) {
        String[] Affirmations = {
                "You're cracked",
                "So goated",
                "Kratom 2024",
                "Moving different",
                "You completed that task like Tom Brady",
                "Some people call you the OJ of Telus",
                "Damn was that task JFK ?  Cause you shot that shit in the head!",
                "Campbell was here",
                "Ask Roslyn what the time is (It will be 3 hours before you expect)",
                "21",
                "drue",
                "Wait you're goated",
                "I will not join the VC until you finish the next task",
                "Mix Bud Light with Texas Pete call that a Buddy Mary",
                "Dude you just got a Shiny task!",
                "Im feeling evidence on this next one",
                "JT Dunphy got kicked out for some reason",
                "Its going to get far worse before it gets any better",
                "I 1v5'd Cole Dilsworth and his posse: https://www.youtube.com/watch?v=cfH911cHqkI&ab_channel=soup",
                "Jordan stop flexin ya muscles",
                "BANG",
                "The Joker was here",
                "Did I tell you how much I love speeding?",
                "You want to hit a bowl so bad (do it)",
                "Hey Lineen!",
                "Fire and Ice",
                "Hamburger jr?",
                "if i had one wish i would use the big red button on at all",
                "Any backjackers in the vc?",
                "we have to hack into the malware",
                "I found scientific evidence that your built different",
                "[Henry in overwatch game chat] KILL YOUR SELF",
                "[emilio out in the woods at night] \"if I saw Campbell out here I would be eating liver for dinner\"",
                "sometimes in church ill just browse the r/cracksmokers subreddit",
                "When you're prairie dogging in the vc",
                "Be the person your dog thinks killed Hitler",
                "You own the Gaza Strip",
                "Yall ever listen to 'Mongolia' by Carti?",
                "Tonights stack: 3 Kratom Beers, 400MG CBD, 5MG melatonin, 2 8-balls",
                "Emilio O'Connor",
                "Trump Mugshot: https://ichef.bbci.co.uk/news/1024/cpsprodpb/13FCD/production/_130896818_donaldtrumpfullmugshot.jpg",
                "Baller",
                "You're balling harder than time and space",
                "Balling harder than LeBron",
                "You're as goated as a goat wearing goat socks on a mountain made of goat cheese.",
                "Greensboro is dope huh?",
                "Old people are going to die soon",
                "Your the G.O.A.T of all time",
                "That task was harder than time and space",
                "I <3 stealing",
                "I <3 shoplifting",
                "I <3 hurting others",
                "I <3 completing tasks",
                "I <3 killing",
                "I <3 looting",
                "I <3 my friends",
                "I <3 Alex",
                "I <3 Linneen",
                "I <3 scamming",
                "I <3 the infinite wasteland of time and space",
                "I <3 all Telus employeees",
                "Snape is my favorite character form Harry Potter",
                "Harry Potter kinda sucks",
                "Listen to DJ Smokey",
                "40 pound bag of shake",
                "I stole $35.23 worth of product from Walmart today",
                "I love stealing more than life itself",
                "Quit and start robbing people",
                "Rick and Morty is a fire show",
                "I love Brian from family guy",
                "Roger the Alian is a funny ass guy",
                "showing my gut to hot chicks",
                "Glaze Clan",
                "saying L marriage to my parents",
                "when you a neph on the outside but you got a unc soul",
                "just dropped a band at starbucks #youngwealthy",
                "lets get a 19 year old to replace feinstein",
                "im voting for chris christie bro he has been crackin me up all day",
                "yo can i hold a few hundred bucks to build a gaming pc",
                "the USA got clapped",
                "I never respected mountain dew",
                "And on the fifth day, god said \"fuck this shit, i'm jerking off in the shower.\"",
                "Going for a 20 min walk is like watching an episode of TV called My Neighborhood",
                "Huffing krazy glue rn",
                "So fly they called pest control ",
                "Antonio brown and doja cat dating. prediction is in. ",
                "Drinking lean with John Mayer",
                "I could have been studying rn",
                "what is the dog doing",
                "The mountaints < jacking off",
                "all my woadies some goaties",
                "writing a self help book titled \"How to be Goaty\"",
                "como se dice im trynna fuck",
                "woke up feeling goaty today",
                "been seeing a lot of pictures of taylor swift at public events lately. why is she outside so much? what is she planning? #staycurious",
                "i want to start beef with my neighbor because life has been getting a little boring",
                "I KEEP THAT STEAMER ON ME LIKE A DIRTY DIAPER",
                "Everytime i see a cop I see an playstation square over the gun",
                "This line was sponsered by George Soros",
                "[Emilio] don't forget to get water ... and get High",
                "Bumblegorp",
                "I maed u a waffel!!! (^w^)>#",
                "8====D~~~~",
                "If you dont do one more task im going to kill you",
                "Nobody is gangstalking you",
                "Your family loves you",
                "You're perfect the way you are",
                "Slitherman was here",
                "I fw you",
                "Henry Smith",
                "TikTok is not that bad",
                "My hair grows really quickly",
                "I will not google symptoms today",
                "My lymph nodes are not swolen",
                "172.17.29.130",
                "I will achieve Big Boss Luxury Lifestyle",
                "Trump mugshot is not better than my selfies",
                "My dad respects art school students",
                "My life is good and full of sex",
                "I dont need drugs and alcohol to have fun",
                "My country does not hate women",
                "I am sane",
                "You're the bee's knees and the cat's pajamas",
                "I use light mode",
                "Shake X Tolerence",
                "This affirmation is sponsered by Andrew Callaghan",
                "Im Tom Brady",
                "achoo",
                "We should get some work beers later",
                "Lets order a Pizza",
                "Sweeter than pie",
                "Posted up at the family function and I have a gun",
                "Listen to Tom Brady on soundcloud",
                "ZXTRAGICCURTIS47 WAZ HERE",
                "I put the D in Drugs",
                "This affirmation is sponsered by Peter Griffin",
                ":jovial:",
                "by golly i cant get enough of this... this... say, what do ya call it again?\r\n" + //
                        "\r\n" + //
                        "\"masturbation, sir.\"\r\n" + //
                        "\r\n" + //
                        "by golly i cant get enough of this 'masturbation'!",
                "I feel like roger from american dad",
                "I'm John Stamos",
                "I'm higher than Ghandi",
                "Yo that fish over there is locked in!",
                "Yo that fish over there is tweaking!",
                "I'm going to eat a yummy cheeserburger",
                "Overwatch fucking sucks man",
                "Overwatch is fucking terrible @JacksonPeavy",
                "you can lead a horse away from heavy metals, but you can't stop it from drinking them",
                "Imagine doing K and jerking it at the beach",
                "Mexican food is goated",
                "BBW is fire",
                "Im about to go crazy on my shit",
                "Jerkin it for Jesus",
                "Where's that DAMN fourth Chaos Emerald?",
                "Don't forget to follow the Rule of Magic Twos!",
                "Make sure you use at least five FMU words in your essays, children.",
                "And now ladies and gentlemen, Mr Conway Twitty",
                "Yabba Dabba Dooooo!",
                "Praying to the Lord",
                "Jesus is my savior",
                "All and all, its just another brick in the wall",
                "We don't need no education",
                "Mother, do you think they will drop the bomb?",
                "I 3-0'ed Logan 50 billion times",
                "Pussy tastes like ketchup",
                "I killed a homeless man for food",
                "I killed a homeless man for sport",
                "Hitting my vape while I pray to Jesus",
                "I fucked a bitch and payed her with pickles",
                "Killed a dude for the meme",
                "Coffee spelled backwards is effoc",
                "Im the shit",
                "Slenderman is scared of my bitch",
                "Franks Red Hotsauce on icecream <3",
                "I'm going to fucking kill you driving crooner",
                "Pop goes the weasel",
                "Warm beer > a hot meal",
                "Ramen with eggs kinda goated",
                "FIRE IN THE HOLE",
                "Emma Emmory",
                "Slenderman made me hate my bitch",
                "I'm going to France to KMS",
                "Slitherman told me to steal money out of my dad's wallet",
                "Joe Rogan looks like a buff bald hobbit",
                "I <3 car crash videos",
                "My room is not messy",
                "Lemme get an everything bagel with a skidmark of poop on it",
                "Ay yo Mikey, lemme get a bagel with cream cheese, salmon, and uhhh let me get the double poop scoop on top",
                "I'll have an everything bagel, hold the cream cheese and can I get just a smear of poop on top?",
                "Yo Mikey how ya doin.  Can I get a plain bagel with cream cheese and uhh lemme get a scoop of poop on top",
                "I don't know who I am anymore",
                "I am simply going through the motions of life.",
                "Just one more task, just one more task...",
                "Manifesting evidence",
                "Shout out evidence",
                "Shout out Tom Brady for kissing his sons on the lips",
                "My SSN is 28-GOATED-38",
                "Shout out Doris Sears",
                "I <3 the Christmas season",
                "Jesus loves you",
                "#HeHasRisen",
                "I have brain worms",
                "tweaker Tweak = new tweaker();",
                "Tweak.tweaking();",
                "My favorite fish is the business fish",
                "A beautiful fish wrote this affirmation",
                "AI generated fish",
                "I wrote \"I'm goated\" on my math final",
                "Teach a horse how to run and it will never ask you how to run again",
                "Taco Bell $6 cravings box with a crunch wrap, soft taco, heroin and a Baja Blast",
                "Rules were meant to be slapped and scolded",
                "Kids from england shouldn't be allowed to read",
                "\\escape sequence",
                "A beautiful fish did acid and became a beautiful boy",
                "Fuck Christian Jr",
                "Fuck Jesus Lover Jr",
                "Not to be a hater but every other Jr sucks",
                "I hope good things come your way",
                "These Telus racks are kinda creamy",
                "I will take out the trash today",
                "Hi its Campbell, love you! <3",
                "George Washington crossed the Delaware to get more pussy",
                "We smokin' shit in a glass pipe, blowin' the Lord's bubbles",
                "My shooter a crackhead, he look like Woody Harrelson",
                "Reach for my neck, you'll get turned into an example",
                "I threw diamonds at the strip clubs under the Great Pyramids",
                "This shit ain't nothin' to me, man",
                "Tied the ops to the back of a Scat Pack and dragged them around the block for 16 hours",
                "Motherfucker looked like a Resident Evil 5 campaign extra after we got done with him",
                "They thought I was Steven Wallace",
                "I have seen the Magna Carta",
                "I've seen the Eye of Hora",
                "Step the wrong way and you will perish",
                "My bitch look like David Hasselhoff",
                "My bitch look like Woody Harrelson",
                "My bitch look like Gene Simmons",
                "My bitch look like Ozzy Osbourne",
                "My bitch look like Howie Mandel",
                "My bitch look like David Blaine, I don't know if she's real or not",
                "Balled so hard they thought I was a fuckin' nutsack",
                "I ball so hard the Glock-34 shivered his timbers",
                "We smokin IBM Quantum Computer",
                "We smokin chips from a gas station",
                "We smokin Chat GPT",
                "We smokin SQL queries",
                "We smokin inspect element on Firefox",
                "We smokin Google Docs",
                "We smokin Microsoft Office",
                "We smokin Java SDK 21.1",
                "We smokin Azure DevOps",
                "I can't wait to curb stomp you in these dumb ugly ass Rick Owens shoes",
                "These cops are interrogating me about an ounce of weed as if I didn't kill an Applebee's hostess two miles away",
                "My diamonds come from the most horrific situations possible",
                "I keep my Glock at the Vatican",
                "Fuck it, I ate the opp",
                "I have more Percs than there are stars in the Leo Cluster",
                "One perc is never enough",
                "I sold crack to myself",
                "She wanted dick, but I gave her crack",
                "I have blueprints to the catacombs",
                "I got more sticks than a fuckin forest",
                "I knew the perc was fake but I still ate it because I'm fucked in the head",
                "Popped a bean, now I wanna kill someone",
                "Every puff is an insult to God",
                "This henny got me feeling like DDG",
                "If Santa come down my chimney, I'm gonna fuck him",
                "This Smith & Wesson got me movin' like an invasive species",
                "Caught a dude trying to come up on my Amazon package so I skinned his ass alive. AAAHHHH!",
                "Blacked out on the percs, ordered a Desert Eagle off Amazon",
                "I need fentanyl, slime",
                "You can't trust me, I don't even trust myself",
                "They thought they could stop a demon, I'm back",
                "I went Judge Judy on that pussy, snipe",
                "Chanel optics got me seein' shit",
                "My money longer than James Cameron",
                "Haters in shambles, they stay pickin' the corn outta my shit",
                "Bitch so bad I made her shit in my chopped cheese",
                "I sold my house to make rent",
                "I bought a bagel with two scoops of poop off the black market",
                "I got more money than Jeff Bezos on a bad day",
                "Mason Troy Adams",
                "New York is mid",
                "Scott Pilgram was based",
                "Linneen doesn't know SHIT",
                "Henry doesn't know SHIT",
                "the fuck are u talkin about dude?",
                "I wanna be the next Morgan Stanlet financial analyst!",
                "I wanna be the next SNL cast member!",
                "Yo fat ass, fun fact she’s allergic to nuts. Go ahead. Ask me why I know that. Ask me fat ass. Because we were sleeping together 🤣🤣 enjoy!",
                "your girl is out there jumping up and down clapping and smiling and laughing for her work husband because he just showed her a vape trick #cuckhorrorstory",
                "what if someone invented something that lasts forever",
                "drake or kendrick? bro idgaf my favorite rapper is YBN Nahmir #SaidNoOneEver",
                "my first son shall be named Boris Johnson",
                "drinking and watching television is quite soothing",
                "jake from state farm is famous because the corporation puppetting him can afford to stick him into any event they please. jake goes and mingles and believes himself to be creating relationships but everyone else is like oh look at the funny clown ill take a picture with the clown",
                "if jake from state farm has zero haters then i have died",
                "youve worked ur entire life for this moment. youve put blood sweat and tears into a sport youve shaped ur entire life around. ur parents are crying. ur siblings are crying. they couldnt be prouder. ur dream is now reality. and they make u do a photoshoot with jake from state farm",
                "@jakefromstatefarm kys",
                "@Mother Earth must be the center of the universe because the Sun goes down on her every night 😅😅 he aint doing that for anyone else 😭😭 #TheFreakyGalaxy",
                "ughh my foes just declared war on my province again. so much for a relaxing spring break. fml",
                "The fentanyl got me moving like a claymation figure",
                "Got the registered God Particle on my hip",
                "The whippet left me with a drool and a shit eating grin", 
                "The bugs are back",
                "I am Chris Griffin",
                "Quinoa Phillip sponsored this task",
                "If you need financial help, call Quinoa Phillip ASAP!!!",
                "Good for the soul and good for the stomach.  Hes Quinoa Phillip.",
        };
        return Affirmations[random.nextInt(Affirmations.length)];
    }

    // Function to get a random response from Billy Butcher
    public static String billyButcherResponse(Random random) {
        String[] BillyButcher = {
                "You did a great job, I'm proud of you!",
                "You deserve a nice bong rip after this!",
                "Wrap it up and spark that peace pipe!",
                "Time to let your hair down and blaze away!",
                "You've earned yourself a one-way ticket to relaxation station!",
                "Time to roll one up and chill like a sloth on a Sunday.",
                "You earned a break, go take a hit and watch the clouds float by, ya lazy bugger.",
                "Wrap up the day and blaze away - you've earned it, ya proper slacker.",
                "Kick back and relax, mate. Puff, puff, pass that stress away.",
                "Another day bites the dust. Time to hit the pen and mellow out.",
                "Clock out and chief down. It's high time for some relaxation.",
                "You've clocked off, now hit the Oxys and let the good vibes roll.",
                "Well done, now hit the shake and let the stress fade away like a bad memory.",
                "You've done your bit, now blaze it and forget about the day, ya weed-loving dreamer.",
                "Time to hit the hay and dream of fields of green. Goodnight, stoner.",
                "Time to hit a blinker and kick back!",
                "Crack open a cold Kratom Beer and relax, you've earned it!",
                "Kratom break, anyone?",
                "Wrap it up, it's 4:20 somewhere!",
                "If Telus had a 'Chill Mode', you'd be there, pal.",
                "Wrap it up and toss back that kratom, you herbal enthusiast.",
                "Time to call it a day and savor that kratom, 'cause reality sucks.",
                "Another day bites the dust. Grab your kratom, it's your sweet escape.",
                "Clock out and get your kratom fix. It's your ticket to la-la land, buddy.",
                "You've earned a break, now sip on that Kratom Beer and drift away.",
                "Well, well, it's quitting time. Kratom o'clock, my friend.",
                "You've done your part, now enjoy some kratom therapy.",
                "It's time to punch out and pop some kratom pills. Life's better through the haze.",
                "Wrap up the day and unwind with kratom. It's your herbal sedative, ain't it?",
                "You've hit the finish line, now hit that fucking kratom and forget the grind.",
                "You've hit the time limit, now hit that bong."
        };

        return BillyButcher[random.nextInt(BillyButcher.length)];
    }
}
