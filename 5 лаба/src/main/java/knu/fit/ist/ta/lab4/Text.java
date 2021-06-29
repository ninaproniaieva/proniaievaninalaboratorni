/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;

/**
 *
 * @author Владимир
 */
@Component
public class Text {

    public static String text;
    static Matcher matcher;
    static Pattern pattern;

    public Text() {
        text = "You wouldn’t know it by all the hype that surrounds the Internet of Things, but I’ll let you in on a little secret. IoT is dead.\n"
                + "It might sound crazy coming from a person who makes a living in and around the world of IoT, but it’s true— IoT is dead because it never really existed in the first place.\n"
                + "According to Wikipedia, IoT is defined as:\n"
                + "…the network of physical devices, vehicles, home appliances, and other items embedded with electronics, software, sensors, actuators, and connectivity which enables these things to connect, collect and exchange data.\n"
                + "When you boil that statement down to its constituent elements you might as well say: it’s a network of devices with electronics (aka computers) that are connected together to exchange data.\n"
                + "According to Wikipedia, the Internet is defined as:\n"
                + "The Internet is the global system of interconnected computer networks that use the Internet protocol suite (TCP/IP) to link devices worldwide.\n"
                + "If you boil that statement down, it might as well say: it’s a network of devices with electronics (aka computers) that are connected together to exchange data.\n"
                + "At the end of the day they are the same thing— using the Internet to connect computers of varying sizes and shapes together.\n"
                + "But IoT has other challenges. Right?\n"
                + "You’ll hear a lot of buzzwords and “new” technologies being thrown around in the IoT world, so surely IoT devices have different needs? Not really. Computers and devices both need connectivity. Computers and devices both need security. Computers and devices both need some edge and some cloud computing power. Computers and devices both need some form of management. The only real difference is one of scale— by 2025 there may be as many as 21.5 billion “IoT” devices connected to the Internet.\n"
                + "When it comes down to it, “IoT” is really just a term of scale— the “thing” part denotes that just about any thing can and will be connected to the Internet (even though in many cases it probably shouldn’t).\n"
                + "There’s little doubt as to the massive scale of devices that will be connected to the Internet in coming years, but there is another (arguably more important) dimension of scale that is often overlooked…\n"
                + "The Scale of Diversity\n"
                + "Unlike the early days of the PC and mobile, there is no one clear monopoly over modern connected devices. Just take a look on Amazon.com and it’s hard to miss the thousands of different options for connected lightbulbs, garage door openers, sprinkler systems, security systems, water heaters, AC units, and on, and on— and this is just in the connected home category (which may end up being the smallest market). There are thousands of other businesses out there providing connectivity and sensors for heavy machinery, transportation, infrastructure, energy, industrial processes, medical, etc.";
    }

    public static String cleanText(String ctext) {

        ctext = ctext.toLowerCase();
        ctext = ctext.replaceAll("\\bthe|and\\b", "").trim();
        ctext = ctext.replaceAll("\\b\\w{1,2}\\b", "").trim();
        ctext = ctext.replaceAll("[^\\w -]", "").trim();
        ctext = ctext.replaceAll("-{2,}", "");
        ctext = ctext.replaceAll(" {2,}", " ");
        return ctext;
    }

    public static List<String> getList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result;
    }

    public static int sizeOfList(String text) {
        List<String> result = Arrays.asList(text.split(" "));
        return result.size();
    }

    public static Set<String> getSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result;
    }

    public static int sizeOfSet(String text) {
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(text.split(" ")));
        return result.size();
    }

    public static ArrayList<String> first7Often(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        ArrayList<String> result = new ArrayList<String>();

        int size = words.size();
        int m = 7; // m - the number of words to perform calculations for
        int[] z = new int[size];
        // z[i] - frequency of occurrence of the word with serial number i
        int[] n = new int[m];
        int[] t = new int[m];
        for (int j = 0; j < size; ++j) {
            z[j] = 0;
            for (int i = 0; i < size; ++i) {

                if (words.get(j).equals(words.get(i))) {
                    z[j] = z[j] + 1;
                }

            }
            for (int q = 0; q < j; ++q) {   //avoid the same words
                if (words.get(j).equals(words.get(q))) {
                    z[j] = 0;
                }
            }
        }

        for (int j = 0; j < m; ++j) {
            for (int i = 0; i < size; ++i) {

                if (z[i] > t[j]) {
                    t[j] = z[i];  //the highest frequency of occurence 
                    n[j] = i;     //the serial number of the word
                }

            }
            z[n[j]] = 0;  //not to repeat words
        }
        for (int y = 0; y < m; ++y) {
            result.add(words.get(n[y]) + " - " + t[y]);
        }

        return result;
    }

    public static int notU(String text) {
        int p = 0;
        pattern = Pattern.compile(("\\b[a-tv-z]+\\b"));
        matcher = pattern.matcher(text);
        while (matcher.find()) {
            ++p;
        }
        return p;
    }

    public static int words4Letters(String text) {
        int p = 0;
        pattern = Pattern.compile(("\\b[a-z]{4}\\b"));
        matcher = pattern.matcher(text);
        while (matcher.find()) {
            ++p;
        }
        return p;
    }

    public static ArrayList<String> seq3Let(String text) {
        int p = 0;
        String stext = text;
        String fseq;

        int t = 0, m = 6, d = 0; // m - the number of sequences to perform calculations with
        // d - so as not to repeat the sequence, t - frequency of occurrence
        String seq = "";
        ArrayList<String> all = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();

        for (int q = 0; q < m; ++q) {
            t = 0;
            for (int i = 3, j = 0; i < text.length(); ++i) {
                p = 0;
                d = 0;
                if (stext.charAt(i - 1) == ' ') {
                    i += 3;
                    j += 3;
                }
                fseq = stext.substring(j, i);
                for (int z = 0; z < q; ++z) {
                    if (fseq.equals(all.get(z))) {
                        d = 1;
                    }
                }
                pattern = Pattern.compile(fseq);
                matcher = pattern.matcher(text);
                while (matcher.find() && d != 1) {
                    ++p;
                }
                if (p > t) {
                    t = p;
                    seq = fseq;
                }
                ++j;
            }
            all.add(seq);
            result.add(seq + " - " + t);
        }
        return result;
    }
}
