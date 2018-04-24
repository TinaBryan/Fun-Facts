package com.example.victoriawest.funfacts;

import android.view.View;

import java.util.Random;

public class FactBook {
    String[] facts = {
            "Elvis Presley was 18 years old when he recorded his first song at Sun Records Studio." +
            "Presley, as an unsigned artist, recorded his first two songs as a birthday gift for his mother in 1953",
            "Mick Jagger is an experienced ballet dancer with years of lessons under his belt",
            "The Pink Floyd album The Dark Side of the Moon lines up perfectly with the 1939 film The Wizard of Oz. " +
            "The rainbow on the album cover further pushes the idea that the two are connected.",
            "U2 front man Bono got his name from a hearing aid store in the centre of Dublin, where he grew up.",
            "Bono's previous pseudonyms were “Bonavox of O’Connell Street,” “Bonavox,” “Bono Vox” and originally \n “Steinhegvanhuysenolegbangbangbang.”",
            "The Doors were the first band to ever promote a new album through a billboard ad.",
            "Reginald Kenneth Dwight is Elton John’s real name.",
            "Some Rock and Roll historians claim that Chuck Berry is the real King of Rock & Roll, not Elvis Presley",
            "Queen holds the Guinness World Record for longest-running rock group fan club",
            "The Eagles were originally the backup band for the singer Linda Ronstadt.",
            "Elvis recorded over 600 songs with a total of zero writing credits.",
            "John Bonham, the drummer for Led Zeppelin, drank 40 shots of vodka the night of his death.",
            "The term used in the 40’s by the US Air Force for UFOs was Foo Fighters.",
            "Lynyrd Skynyrd got its name from a high school teacher, Leonard Skinner." +
                    " The teacher was notorious for suspending students for having long hair.",
            "The song “Black Dog” got its name after a Black Labrador roamed into the studio during a Led Zeppelin recording session. ",
            "Eric Clapton wrote the song “Layla” with the intention of stealing George Harrison’s wife.",
            "Sharon Osborne’s Pomeranian was once saved from a coyote attack when Ozzy tackled the wild animal and wrestled it until the dog was released.",
            "ABBA got its name by taking the first letter of each band member’s name.",
            "The Doors got their band name from the Aldous Huxley book, “The Doors of Perception”",
            "Elvis was told to “stick to driving a truck because you’ll never make it as a singer” during an audition for a local Memphis band. " +
                    "He recorded his first single “That’s Alright” soon after.",
            "Jimi Hendrix created the song “Little Wing” in a mere 145 seconds.",
            " Bob Dylan's “Highway 61 Revisited” is named after Route 61, the highway that goes through his home state Minnesota through the Mississippi Delta.",







            };

    public String getFact() {
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(facts.length);
            return facts[randomNumber];

    }
}
