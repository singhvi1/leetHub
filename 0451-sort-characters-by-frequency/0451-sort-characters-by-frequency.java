class Solution {
    public String frequencySort(String s) {
        Pair[] freq = new Pair[128];

        for (int i = 0; i < 128; i++) {
            freq[i] = new Pair(0, (char) (i));
        }

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)].freq++;
        }

        Arrays.sort(freq, (p1, p2) -> Integer.compare(p2.freq, p1.freq));

        StringBuilder sb = new StringBuilder();
        int i = 0;

        // System.out.println(Arrays.toString(freq));
        for (Pair p : freq) {
            while (p.freq > 0) {
                sb.append(p.ch);
                p.freq--;
            }
        }

        return sb.toString();
    }
}

class Pair {
    int freq;
    char ch;

    Pair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }

    @Override
    public String toString() {
        //            System.out.println("{ " + this.freq + ", " + this.ch + " }");
        return "{ " + this.freq + ", " + this.ch + " }";
    }
}