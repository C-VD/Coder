package com.example.coder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CoderTest {
 //   @Test
 /*   void testEncodeByString(){
        Assertions.assertEquals(Coder.encodeByStrings(
                "черное море",
                "черное>белое"
                ), "белое море");
        Assertions.assertEquals(Coder.encodeByStrings(
                "красный, желтый и зеленый",
                "красный>желтый\nжелтый>зеленый"
                ), "желтый, зеленый и зеленый");
        Assertions.assertEquals(Coder.encodeByStrings(
                "красный, желтый и зеленый",
                ""
                ), "желтый, зеленый и зеленый");
        Assertions.assertEquals(Coder.encodeByStrings(
                "",
                "красный>желтый\nжелтый>зеленый"
                ), "");
        Assertions.assertEquals(Coder.encodeByStrings("баба Яга", "гусь>>>лебедь"
                ), "баба Яга");
        Assertions.assertEquals(Coder.encodeByStrings("баба Яга", "пустота>"
                ), "баба Яга");
        Assertions.assertEquals(Coder.encodeByStrings("баба Яга", ">пустота"
                ), "баба Яга");
        Assertions.assertEquals(Coder.encodeByStrings("баба Яга", ">баба"
                ), " Яга");
        Assertions.assertEquals(Coder.encodeByStrings("железный дровосек",
                "железный>металлический\n\nдровосек>топор"
        ), "металлический топор");
        Assertions.assertEquals(Coder.encodeByStrings("железный дровосек",
                "железный>металлический  \n  \n  дровосек>топор"
        ), "металлический топор");
        Assertions.assertEquals(Coder.encodeByStrings("железный дровосек",
                "железный  >  металлический\nдровосек>\tтопор"
        ), "металлический топор");
        Assertions.assertEquals(Coder.encodeByStrings(
                "железный дровосек",
                "\n\n673937\n\tжелезный>металлический\nдровосек\t>топор"
        ), "металлический топор");
    }
    @Test
    void testDecodeByString(){
        Assertions.assertEquals(Coder.decodeByStrings(
                "черное море",
                "белое>черное"),
                "белое море");
        Assertions.assertEquals(Coder.decodeByStrings(
                "красный, желтый и зеленый",
                "желтый>красный\nзеленый>желтый"),
                "желтый, зеленый и зеленый");
        Assertions.assertEquals(Coder.decodeByStrings(
                "красный, желтый и зеленый",
                ""),
                "желтый, зеленый и зеленый");
        Assertions.assertEquals(Coder.decodeByStrings(
                "",
                "желтый>красный\nзеленый>желтый"),
                "");
        Assertions.assertEquals(Coder.decodeByStrings(
                "баба Яга",
                "лебедь>>>гусь"),
                "баба Яга");
        Assertions.assertEquals(Coder.decodeByStrings(
                "баба Яга",
                ">пустота"),
                "баба Яга");
        Assertions.assertEquals(Coder.decodeByStrings(
                "баба Яга",
                "пустота>"),
                "баба Яга");
        Assertions.assertEquals(Coder.decodeByStrings(
                "баба Яга",
                "баба>"),
                " Яга");

        Assertions.assertEquals(Coder.decodeByStrings(
                "железный дровосек",
                "металлический>железный\n\nтопор>дровосек"),
                "металлический топор");
        Assertions.assertEquals(Coder.decodeByStrings(
                "железный дровосек",
                "металлический>железный  \n  \n  топор>дровосек"),
                "металлический топор");
        Assertions.assertEquals(Coder.decodeByStrings(
                "железный дровосек",
                "металлический  >  железный\nтопор>\tдровосек"),
                "металлический топор");
        Assertions.assertEquals(Coder.decodeByStrings(
                "железный дровосек",
                "\n\n673937\n\tметаллический>железный\n\tтопор>дровосек"),
                "металлический топор");
    }
*/
    @Test
    void testDictToEncodeMap(){
        HashMap<String, String> expected = new HashMap<>();
        expected.put("сорока", "ворона");
        expected.put("кошка", "собака");
        expected.put("3", "11");
        expected.put("5", "очень хорошо");
        Assertions.assertEquals(Coder.dictToEncodeMap(Arrays.asList(new String[]{
                "сорока>ворона",
                "кошка>собака",
                "3>11",
                "5>очень хорошо",
                "1>очень плох>о"
        })), expected);
        Assertions.assertEquals(Coder.dictToEncodeMap(Arrays.asList(new String[]{
                "сорока>ворона",
                "кошка>собака",
                "3>11",
                "оченьплохо",
                "",
                "5>очень хорошо"
        })), expected);
    }
}
