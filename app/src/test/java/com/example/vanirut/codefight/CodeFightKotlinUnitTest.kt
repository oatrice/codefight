package com.example.vanirut.myapplication

import com.example.vanirut.codefight.CodeFight
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class CodeFightKotlinUnitTest {

    /*@Test
    @Throws(Exception::class)
    fun century_from_year() {
        for (year in 1..2005) {
            val centuryYear = CodeFight.centuryFromYear(year)
            println("year: $year, century year: $centuryYear")
            //assertEquals(2, 2);
        }
    }*/

    /*@Test
    @Throws(Exception::class)
    fun check_palindrome() {
        val testPalindromeString = listOf<String>(
            "sore was i ere i saw eros",
            "a man, a plan, a canal -- panama	",
            "never a foot too far, even",
            "euston saw i was not sue",
            "live on evasions? no, i save no evil",
            "red roses run no risk, sir, on nurses order",
            "salisbury moor, sir, is roomy. rub silas",
            "marge, let's \"went\" i await news telegram",
            "a new order began, a more roman age bred rowena",
            "i, man, am regal; a german am i",
            "tracy, no panic in a pony-cart",
            "egad! loretta has adams as mad as a hatter. old age!	",
            "eve, mad adam, eve!	",
            "resume so pacific a pose, muser",
            "marge let a moody baby doom a telegram",
            "tenet c is a basis, a basic tenet",
            "nella's simple hymn: \"i attain my help, miss allen\"",
            "straw? no, too stupid a fad. i put soot on warts",
            "sir, i demand, i am a maid named iris",
            "lay a wallaby baby ball away, al",
            "tessa's in italy, latin is asset",
            "noel sees leon",
            "no, it can assess an action",
            "bob: \"did anna peep\" anna: \"did bob\"",
            "sex at noon taxes",
            "egad, a base life defiles a bad age",
            "\"stop\" nine myriad murmur. \"put up rum, rum, dairymen, in pots\"",
            "delia, here we nine were hailed",
            "not i, no hotel, cycle to honiton",
            "anne, i vote more cars race rome-to-vienna",
            "mother eve's noose we soon sever, eh, tom?	",
            "\"sue,\" tom smiles, \"selim smote us\"",
            "telegram, margelet!	",
            "too hot to hoot",
            "unglad, i tar a tidal gnu",
            "eve damned eden, mad eve",
            "snug satraps eye sparta's guns",
            "nurse, save rare vases, run!	",
            "draw, o caesar, erase a coward",
            "no mists or frost, simon",
            "sail on, game vassal! lacy callas save magnolias!	",
            "trap a rat! stare, piper, at star apart",
            "sue, dice, do, to decide us",
            "la, mr. o'neill, lie normal",
            "top step -- sara's pet spot",
            "eel-fodder, stack-cats red do flee",
            "reg, no lone car won, now race no longer",
            "zeus was deified, saw suez",
            "evil is a name of a foeman, as i live",
            "no waste, grab a bar, get saw on",
            "\"degenerate moslem, a cad\" eva saved a camel so meta reneged",
            "was it felt? i had a hit left, i saw",
            "won't i repaper? repaper it now",
            "too far, edna, wander afoot",
            "stella won no wallets",
            "\"do nine men interpret\" \"nine men,\" i nod",
            "nurse, i spy gypsies, run!	",
            "draw pupil's pup's lip upward",
            "lewd did i live, and, edna, evil i did dwel",
            "\"sirrah! deliver deified desserts detartrated\" stressed deified, reviled harris",
            "all erotic, i lose my lyme solicitor, ella",
            "no, is ivy's order a red rosy vision?	",
            "no word, no bond, row on",
            "on tub, edward imitated a cadet; a timid raw debut, no?	",
            "tense, i snap sharon roses, or norah's pansies net",
            "\"deliver desserts,\" demanded nemesis, \"emended, named, stressed, reviled\"",
            "no, it is opposed; art sees trade's opposition",
            "\"knight, i ask nary rank,\" saith gink",
            "moors dine, nip -- in enid's room",
            "\"ma,\" jerome raps pot top, \"spare more jam\"",
            "live not on evil deed, live not on evil",
            "sir, i'm iris!	",
            "now do i repay a period won",
            "a rod, not a bar, a baton, dora",
            "now saw ye no mosses or foam, or aroma of roses. so money was won",
            "amiced was i ere i saw decima",
            "\"pooh,\" smiles eva, \"have selim's hoop\"",
            "no, set a maple here, help a mate, son",
            "a war at tarawa!	",
            "some men interpret nine memos",
            "delia sailed as sad elias ailed",
            "ned, i am a maiden",
            "dennis sinned",
            "remit rome cargo to go to grace mortimer",
            "did dean aid diana? ed did",
            "i told edna how to get a mate: \"go two-handed\" loti",
            "sire, was i ere i saw eris?	",
            "now eve, we're here, we've won",
            "\"suit no regrets\" a motto, master gerontius",
            "eve, man, am eve!	",
            "slap-dab set-up, mistress ann asserts, imputes bad pals",
            "tuna nut",
            "saladin enrobes a baroness, senora, base-born enid, alas",
            "deny me not; atone, my ned",
            "roy ames, i was a wise mayor",
            "wonders in italy, latin is \"red\" now",
            "tis ivan on a visit",
            "did ione take kate? no, i did",
            "solo gigolos",
            "no, it is open on one position",
            "he goddam mad dog, eh?	",
            "ned, go gag ogden",
            "draw no dray a yard onward",
            "\"revolt, love\" raved eva. \"revolt, lover\"",
            "enid and edna dine",
            "anne, i stay a day at sienna",
            "senile felines",
            "max, i stay away at six a.m",
            "ere hypocrisies or poses are in, my hymn i erase. so prose i, sir, copy here",
            "st. simon sees no mists",
            "draw, o coward!	",
            "top step's pup's pet spot",
            "noel, did i not rub burton? i did, leon",
            "puss, a legacy! rat in a snug, unsanitary cage, lass, up!	",
            "rise to vote, sir",
            "noel saw i was leon",
            "now, sir, a war is won!	",
            "ha! robed selim smiles, deborah!	",
            "degas, are we not drawn onward, we freer few, drawn onward to new eras aged?	",
            "now ere we nine were held idle here, we nine were won",
            "yo! bottoms up, u.s. motto, boy!	",
            "nor i nor emma had level'd a hammer on iron",
            "al lets della call ed, stella",
            "no dot nor ottawa, \"legal age\" law at toronto, don",
            "yes, mark, cable to hotel, \"back ramsey\"",
            "was it a bar or a bat i saw?	",
            "marge lets norah see sharon's telegram",
            "analytic paget saw an inn in a waste-gap city, lana",
            "was raw tap ale not a reviver at one lap at warsaw?	",
            "live on, time; emit no evil",
            "\"not for cecil\" asks alice crofton",
            "ban campus motto, \"bottoms up, macnab\"",
            "so may apollo pay amos",
            "norma is as selfless as i am, ron",
            "arden saw i was nedra",
            "won't lovers revolt now?	",
            "do not start at rats to nod",
            "ha! on, on, o noah!	",
            "norah's foes order red rose of sharon",
            "i made border bard's drowsy swords; drab, red-robed am i",
            "emil, asleep, hannah peels a lime",
            "set a broom on no moor, bates",
            "ten dip a rapid net",
            "o render gnostic illicit song, red nero",
            "are we not drawn onwards, we jews, drawn onward to new era?	",
            "mother at song no star, eh tom?	",
            "i maim nine men in saginaw; wan, i gas nine men in miami",
            "so may get arts award. draw a strategy, amos",
            "nella, demand a lad named allen",
            "yes, syd, owen saved eva's new odyssey",
            "\"now dine,\" said i as enid won",
            "lepers repel",
            "may a moody baby doom a yam?	",
            "draw -- aye, no melody -- dole-money award",
            "mirth, sir, a gay asset? no, don't essay a garish trim",
            "see few owe fees",
            "stressed was i ere i saw desserts",
            "name i -- major-general clare -- negro jamie man",
            "tennis set won now tess in net",
            "ewer of miry rim for ewe",
            "sh! tom sees moths",
            "no misses ordered roses, simon",
            "\"stop, syrian, i start at rats in airy spots\"",
            "i, marian, i too fall; a foot-in-air am i",
            "evade me, dave",
            "delia's debonair dahlias, poor, drop, or droop. sail, hadrian; obed sailed",
            "no ham came, sir, now siege is won. rise, macmahon",
            "now ned, i am a maiden nun; ned, i am a maiden won",
            "ten animals i slam in a net",
            "did i draw della too tall, edward? i did?	",
            "go hang a salami, i'm a lasagna hog",
            "di, did i as i said i did?	",
            "milestones? oh, 'twas i saw those, not selim",
            "no, it's a bar of gold, a bad log for a bastion",
            "\"naomi, sex at noon taxes\", i moan",
            "snug & raw was i ere i saw war & guns",
            "doc, note, i dissent. a fast never prevents a fatness. i diet on cod",
            "live was i ere i saw evil",
            "red now on level -- no wonder",
            "stop! murder us not tonsured rumpots!	",
            "step on hose-pipes? oh no, pets",
            "stiff, o dairyman, in a myriad of fits",
            "to nets, ah, no, son, haste not",
            "dennis, no misfit can act if simon sinned",
            "revered now i live on. o did i do no evil, i wonder ever?	",
            "sore was i ere i saw eros",
            "noel, lets egg estelle on",
            "in a regal age ran i",
            "\"novrad,\" sides reversed, is \"darvon\"",
            "name now one man",
            "dennis and edna sinned",
            "nora, alert, saws goldenrod-adorned logs, wastrel aaron!	",
            "sums are not set as a test on erasmus",
            "deliver, eva, him i have reviled",
            "damosel, a poem? a carol? or a cameo pale? (so mad!)	",
            "doom an evil deed, liven a mood",
            "god, a red nugget! a fat egg under a dog!	",
            "nurse's onset abates, noses run",
            "roy, am i mayor?	",
            "ron, eton mistress asserts i'm no tenor",
            "i tip away a wapiti",
            "adelberta was i ere i saw a trebled \"a\"",
            "sit on a potato pan, otis",
            "moorgate got nine men in to get a groom",
            "repel evil as a live leper",
            "eva, can i stab bats in a cave?	",
            "did hannah say as hannah did?	",
            "goddesses so pay a possessed dog",
            "eva, lave!	",
            "ah, satan sees natasha",
            "do good's deeds live on? no, evil's deeds do, o god",
            "madame, not one man is selfless; i name not one madam",
            "dora tended net, a rod",
            "golf, no, sir, prefer prison flog",
            "nella risks all: \"i will ask sir allen\"",
            "now do i report \"sea moth\" to maestro, period? won",
            "selim's tired, no wonder, it's miles",
            "\"so i darn on,\" a canon radios",
            "war-distended nets i draw",
            "stephen, my hat! ah, what a hymn, eh, pets?	",
            "mad zeus, no live devil, lived evil on suez dam",
            "bog dirt up a sidetrack carted is a putrid gob",
            "mad? am i, madam?	",
            "madam, in eden i'm adam!	",
            "ward nurses run \"draw\"",
            "live dirt up a sidetrack carted is a putrid evil",
            "oh who was it i saw, oh who?	",
            "\"reviled did i live,\" said i, \"as evil i did deliver\"",
            "live was i ere i saw evil",
            "pull up, eva, we're here, wave, pull up",
            "revolt on yale, democrats edit \"noon-tide star\" come, delay not lover",
            "won race, so loth to lose car now",
            "no, it never propagates if i set a \"gap\" or prevention",
            "delia sailed, eva waved, elias ailed",
            "i maim nine more hero-men in miami",
            "rise, morning is red, no wonder-sign in rome, sir",
            "emil asleep, allen yodelled \"oy\" nella peels a lime",
            "no. i save on final perusal, a sure plan if no evasion",
            "yreka bakery",
            "he lived as a devil, eh?	",
            "i saw thee, madame, eh? 'twas i",
            "dior droid",
            "regard a mere mad rager",
            "i saw desserts; i'd no lemons, alas no melon. distressed was i",
            "a dog! a panic in a pagoda!	",
            "yawn a more roman way",
            "semite, be sure! damn a man-made ruse betimes",
            "pull up if i pull up",
            "able was i ere i saw elba",
            "eve saw diamond, erred, no maid was eve",
            "\"slang is not suet, is it\" euston signals",
            "i roamed under it as a tired, nude maori",
            "pa's a sap",
            "no, miss, it is simon",
            "step on no pets!	",
            "niagara, o roar again!	",
            "lewd did i live; evil i did dwel",
            "too bad, i hid a boot",
            "\"rats gnash teeth,\" sang star",
            "lapp, mac? no, sir, prison-camp pal",
            "tide-net safe, soon, allin. a manilla noose fastened it",
            "i moan, naomi",
            "too far away, no mere clay or royal ceremony, a war afoot",
            "rats live on no evil star",
            "deer frisk, sir, freed",
            "i did roar again, niagara! ... or did i?	",
            "no evil shahs live on",
            "o gnats, tango!	",
            "stop, syrian, i start at rats in airy spots",
            "\"not new york,\" roy went on",
            "\"norah's moods,\" naomi moans, \"doom sharon\"",
            "eva, can i pose as aesop in a cave?	",
            "trade ye no mere moneyed art",
            "was it a rat i saw?	",
            "help max, enid -- in example, \"h\"",
            "so may obadiah, even in nineveh, aid a boy, amos",
            "see, slave, i demonstrate yet arts no medieval sees",
            "egad, a base tone denotes a bad age",
            "lew, otto has a hot towel",
            "\"warden in a cap,\" mac's pup scamp, a canine draw",
            "paget saw an inn in a waste gap",
            "a slut nixes sex in tulsa",
            "must sell at tallest sum",
            "naomi, did i moan?	",
            "drab red, no londer bard",
            "revenge my baby, meg? never!	",
            "stop, syrian, i see bees in airy spots",
            "did i do, o god, did i as i said i'd do? good, i did!	",
            "pusillanimity obsesses boy tim in \"all is up\"",
            "refasten gipsy's pig-net safer",
            "pat and edna tap",
            "adam, i'm ada!	",
            "ma is as selfless as i am",
            "poor dan is in a droop",
            "leon sees noel",
            "so may obadiah aid a boy, amos",
            "sis, sargasso moss a grass is",
            "now, ned, i am a maiden won",
            "i moan, \"live on, o evil naomi\"",
            "delia and edna ailed",
            "so remain a mere man. i am eros",
            "no lemons, no melon",
            "never odd or even",
            "rise, sir lapdog! revolt, lover! god, pal, rise, sir!	",
            "ah, aristides opposed it, sir, aha!	",
            "ma is a nun, as i am",
            "madam, i'm adam",
            "star? come, donna melba, i'm an amiable man -- no democrats!	",
            "we'll let dad tell lew",
            "no, it is opposition",
            "no benison, no sin, ebon",
            "ladle histolytic city lots i held, al",
            "harass selfless sarah!	",
            "ten? no bass orchestra tarts, eh? cross a bonnet!	",
            "si, we'll let dad tell lewis",
            "in airy sahara's level, sarah, a syrian, i",
            "nor i, fool, ah no? we won halo -- of iron",
            "we seven, eve, sew",
            "peel's lager on red rum did murder no regal sleep",
            "\"go, droop aloof,\" sides reversed, is \"fool a poor dog\"",
            "sir, i soon saw bob was no osiris",
            "st. eloi, venin saved a mad eva's nine violets",
            "here so long? no loser, eh?	",
            "flee to me, remote elf",
            "six at party, no pony-trap, taxis",
            "drab as a fool, as aloof as a bard",
            "red? rum, eh? 'twas i saw the murder",
            "pull a bat! i held a ladle, hit a ball up",
            "no, hal, i led delilah on",
            "nomists reign at tangier, st. simon",
            "nemo, we revere women",
            "harass sensuousness, sarah",
            "are we not, rae, near to new era?	",
            "red root put up to order",
            "\"sal is not in\" ruth asks. \"ah, turn it on, silas\"",
            "retracting, i sign it, carter",
            "a toyota",
            "he won a toyota now, eh?	",
            "gate-man sees name, garage-man sees name-tag",
            "live not on evil",
            "nella won't set a test now, allen",
            "ha! i rush to my lion oily moths, uriah!	",
            "live dirt, up a side-track carted, is a putrid evil",
            "dog, as a devil deified, lived as a god",
            "not so, boston"

        )

        for (position in 0..testPalindromeString.size-1) {
//            val centuryYear = CodeFight.checkPalindromeByReverse(testPalindromeString[position])
            val centuryYear = CodeFight.checkPalindromeByHopping(testPalindromeString[position])
//            println("input: ${testPalindromeString[position]}, output: $centuryYear")
            //assertEquals(2, 2);
        }


    }*/

    /*@Test
    @Throws(Exception::class)
    fun adjacent_elements_product() {
        val input1 = intArrayOf(3, 6, -2, -5, 7, 3)
        val expected1 = 21

        val input2 = intArrayOf(-1, -2)
        val expected2 = 2

        val input3 = intArrayOf(5, 1, 2, 3, 1, 4)
        val expected3 = 6

        val input4 = intArrayOf(1, 2, 3, 0)
        val expected4 = 6

        val input5 = intArrayOf(9, 5, 10, 2, 24, -1, -48)
        val expected5 = 50

        val input6 = intArrayOf(5, 6, -4, 2, 3, 2, -23)
        val expected6 = 30

        val input7 = intArrayOf(4, 1, 2, 3, 1, 5)
        val expected7 = 6

        val input8 = intArrayOf(-23, 4, -3, 8, -12)
        val expected8 = -12

        val input9 = intArrayOf(1, 0, 1, 0, 1000)
        val expected9 = 0

        val output1 = CodeFight.adjacentElementsProduct(input1)
        val output2 = CodeFight.adjacentElementsProduct(input2)
        val output3 = CodeFight.adjacentElementsProduct(input3)
        val output4 = CodeFight.adjacentElementsProduct(input4)
        val output5 = CodeFight.adjacentElementsProduct(input5)
        val output6 = CodeFight.adjacentElementsProduct(input6)
        val output7 = CodeFight.adjacentElementsProduct(input7)
        val output8 = CodeFight.adjacentElementsProduct(input8)
        val output9 = CodeFight.adjacentElementsProduct(input9)

        assertEquals(expected1, output1)
        assertEquals(expected2, output2)
        assertEquals(expected3, output3)
        assertEquals(expected4, output4)
        assertEquals(expected5, output5)
        assertEquals(expected6, output6)
        assertEquals(expected7, output7)
        assertEquals(expected8, output8)
        assertEquals(expected9, output9)

    }*/

    /*@Test
    @Throws(Exception::class)
    fun shape_area() {
        val input = longArrayOf(2, 3, 1, 5, 4, 10000)
        val expected = longArrayOf(5, 13, 1, 41, 25, 199980001)

        for (i in 0..input.size-1){
            val output = CodeFight.shapeArea(input[i])
            assertEquals(expected[i], output)
        }

    }*/

    /*@Test
    @Throws(Exception::class)
    fun make_array_consecutive() {
        val input = arrayOf(
                intArrayOf(6, 2, 3, 8),
                intArrayOf(0, 3),
                intArrayOf(5, 4, 6),
                intArrayOf(6, 3),
                intArrayOf(1)
        )

        val expected = intArrayOf(3, 2, 0, 2, 0)

        for (i in 0..input.size-1){
            val output = CodeFight.makeArrayConsecutive(input[i])
            println("output: $output")
            assertEquals(expected[i], output)
        }

    }*/

    /*@RequiresApi(Build.VERSION_CODES.N)
    @Test
    @Throws(Exception::class)
    fun almost_increasing_sequence() {
        val input = arrayOf(
            intArrayOf(1, 3, 2, 1),
            intArrayOf(1, 3, 2),
            intArrayOf(1, 2, 1, 2),
            intArrayOf(1, 4, 10, 4, 2),
            intArrayOf(10, 1, 2, 3, 4, 51),

            intArrayOf(1, 1, 1, 2, 3),
            intArrayOf(0, -2, 5, 6),
            intArrayOf(1, 2, 3, 4, 5, 3, 5, 6),
            intArrayOf(40, 50, 60, 10, 20, 30),
            intArrayOf(1, 1),

            intArrayOf(10, 1, 2, 3, 4, 5, 6, 1),
            intArrayOf(1, 2, 3, 4, 3, 6),
            intArrayOf(1, 2, 3, 4, 99, 5, 6),
            intArrayOf(123, -17, -5, 1, 2, 3, 12, 43, 45),
            intArrayOf(3, 5, 67, 98, 3)
        )

        val expected = booleanArrayOf(
                false, true, false, false, true,
                false, true, false, false, true,
                false, true, true, true, true
        )

        for (i in 0..input.size-1){
            val output = CodeFight.almostIncreasingSequence(input[i])
            println("output: $output")
            assertEquals(expected[i], output)
        }
    }*/

    /*@RequiresApi(Build.VERSION_CODES.N)
    @Test
    @Throws(Exception::class)
    fun almost_increasing_sequence_extremely() {

        val extremlyInputSize = Math.pow(10.0, 5.0).toInt()
        val extremlyInput = arrayListOf<Int>()
        for (i in 1..extremlyInputSize){
            val random = Random().nextInt(extremlyInputSize)
            //println("random: $random")
            extremlyInput.add(random)
        }

        val startTime = System.currentTimeMillis()
        val startTime2 = System.nanoTime()
        val extremlyOutput = CodeFight.almostIncreasingSequence(extremlyInput.toIntArray())
        val endTime = System.currentTimeMillis()
        val endTime2 = System.nanoTime()
        println("extremlyOutput: $extremlyOutput")
        println("time1: ${endTime - startTime}")
        println("time3: ${endTime2 - startTime2}")

    }*/

    /*@Test
    @Throws(Exception::class)
    fun almost_increasing_sequence() {

        val input = arrayOf(
            intArrayOf(1, 3, 2, 1),
            intArrayOf(1, 3, 2),
            intArrayOf(1, 2, 1, 2),
            intArrayOf(1, 4, 10, 4, 2),
            intArrayOf(10, 1, 2, 3, 4, 51),

            intArrayOf(1, 1, 1, 2, 3),
            intArrayOf(0, -2, 5, 6),
            intArrayOf(1, 2, 3, 4, 5, 3, 5, 6),
            intArrayOf(40, 50, 60, 10, 20, 30),
            intArrayOf(1, 1),

            intArrayOf(10, 1, 2, 3, 4, 5, 6, 1),
            intArrayOf(1, 2, 3, 4, 3, 6),
            intArrayOf(1, 2, 3, 4, 99, 5, 6),
            intArrayOf(123, -17, -5, 1, 2, 3, 12, 43, 45),
            intArrayOf(3, 5, 67, 98, 3)
        )

        val expected = booleanArrayOf(
                false, true, false, false, true,
                false, true, false, false, true,
                false, true, true, true, true
        )

        for (i in 0..input.size-1){
            val startTime = System.currentTimeMillis()
            val output = CodeFight.almostIncreasingSequence(input[i])
            val endTime = System.currentTimeMillis()
            println("Time: ${endTime - startTime}")
            println("output: $output \ni: $i")
            assertEquals(expected[i], output)
        }

    }*/

    /*@Test
    @Throws(Exception::class)
    fun prime_number() {
        val startTime = System.currentTimeMillis()
//        findPrimeNumber()
//        findPrimeNumber2()
//        findPrimeNumber3()
//        findPrimeNumber4()
//        findPrimeNumber44()
        findPrimeNumber444()
//        findPrimeNumber4444()
//        findPrimeNumber5()
        val endTime = System.currentTimeMillis()
        println("time: ${endTime - startTime}")
    }*/

    @Test
    @Throws(Exception::class)
    fun matrix_elements_sum() {

        val input1 = arrayOf(
                intArrayOf(1,1,1),
                intArrayOf(2,2,2),
                intArrayOf(3,3,3)
        )

        val input2 = arrayOf(
                intArrayOf(1,1,1,0),
                intArrayOf(0,5,0,1),
                intArrayOf(2,1,3,10)
        )

        val input3 = arrayOf(
                intArrayOf(0)
        )

        val input4 = arrayOf(
                intArrayOf(1, 2, 3, 0, 5),
                intArrayOf(6, 0, 8, 9, 0),
                intArrayOf(2, 1, 0, 5, 8),
                intArrayOf(1, 5, 6, 2, 4),
                intArrayOf(0, 7, 8, 3, 4)
        )

        val inputAll = arrayOf(input1, input2, input3, input4)
//        val expectedAll = intArrayOf(0, 0, 0, 0)
        val expectedAll = intArrayOf(18, 9, 0, 28)

        for (position in 0..inputAll.size-1) {
            val output = CodeFight.matrixElementsSum(inputAll[position])
            assertEquals(expectedAll[position], output)
        }
    }


}