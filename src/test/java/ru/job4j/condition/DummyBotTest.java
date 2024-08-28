package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String input = "Hi, Bot.";
        String result = DummyBot.answer(input);
        String expectid = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expectid);
    }

    @Test
    void whenByeBot() {
        String input = "Bye, Bot.";
        String result = DummyBot.answer(input);
        String expectid = "See you later.";
        assertThat(result).isEqualTo(expectid);
    }

    @Test
    void whenUnknownBot() {
        String input = "Can you add two plus two?";
        String result = DummyBot.answer(input);
        String expectid = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expectid);
    }
}