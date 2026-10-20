// LC 271. Encode and Decode Strings
// https://leetcode.com/problems/encode-and-decode-strings/

import java.util.ArrayList;
import java.util.List;

class EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for (String str : strs) {
            s.append(str.length()).append("#").append(str);
        }

        return s.toString();
    }

    public List<String> decode(String str) {
        int i = 0;

        List<String> strList = new ArrayList<>();

        while (i < str.length()) {
            int hash = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, hash));

            strList.add(str.substring(hash + 1, hash + 1 + len));

            i = hash + 1 + len;
        }

        return strList;
    }
}
