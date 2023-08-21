package com.example.coder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class Coder {
    static String encodeByStrings(String message, List<String> dictionary){
        HashMap<String, String> dictMap = dictToEncodeMap(dictionary);
        String encodedMessage = replaceByMap(message, dictMap);
        return encodedMessage;
    }
    static String decodeByStrings(String encodedMessage, List<String> dictionary){
        HashMap<String, String> dictMap = dictToDecodeMap(dictionary);
        String decodedMessage = replaceByMap(encodedMessage, dictMap);
        return decodedMessage;
    }

    static HashMap<String, String> dictToEncodeMap(List<String> dictText){
        HashMap<String, String> dictMap = new HashMap<>();
        for (String s :dictText) {
            String[] pair = s.split(">");
            if(pair.length == 2){
                dictMap.put(pair[0], pair[1]);
            }
        }
        return dictMap;
    }
static HashMap<String, String> dictToDecodeMap(List<String> dictText){
        HashMap<String, String> dictMap = new HashMap<>();
        for (String s :dictText) {
            String[] pair = s.split(">");
            if(pair.length == 2){
                dictMap.put(pair[1], pair[0]);
            }
        }
        return dictMap;
    }

    static String encode(String message, String dictFileName){
        List<String> dictionary = getDictionary(dictFileName);
        String encoded = encodeByStrings(message, dictionary);
        return encoded;
    }

    static String decode(String message, String dictFileName){
        List<String> dictionary = getDictionary(dictFileName);
        if (dictionary == null) {
            return message;
        }
        String decoded = decodeByStrings(message, dictionary);
        return decoded;
    }

    static List<String> getDictionary(String dictFileName) {
        try{
            List<String> dictLines = (Files.readAllLines(Path.of(dictFileName)));
            return dictLines;
        }catch (Exception e){
            return null;
        }
    }

    static String replaceByMap(String text, HashMap<String, String> map){
        for (String key:
        map.keySet()) {
            text = text.replaceAll(key, map.get(key));
        }
        return text;
    }
}
