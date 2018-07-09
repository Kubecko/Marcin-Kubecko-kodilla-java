package com.kodilla.patterns.social;

import com.kodilla.patterns.social.forums.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User martin = new Millenials("Martin");
        User bartosz = new YGeneration("Bartosz");
        User irena = new ZGeneration("Irena");

        //When
        String martinSelect = martin.sharePost();
        System.out.println("Martin selected: " + martinSelect);
        String bartoszSelect = bartosz.sharePost();
        System.out.println("Bartosz selected: " + bartoszSelect);
        String irenaSelected = irena.sharePost();
        System.out.println("Irena Selected: " + irenaSelected);

        //Then
        Assert.assertEquals("[ I use a social forum: ] Facebook Publisher", martinSelect);
        Assert.assertEquals("[ I use a social forum: ] Snapchat Publisher", bartoszSelect);
        Assert.assertEquals("[ I use a social forum: ] Twitter Publisher", irenaSelected);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User martin = new Millenials("Matin");

        //When
        String martinSelected = martin.sharePost();
        System.out.println("Martin selected: " + martinSelected);
        martin.setSocialPublisher(new SnapchatPublisher());
        martinSelected = martin.sharePost();
        System.out.println("Martin new selected: " + martinSelected);

        //Then
        Assert.assertEquals("[ I use a social forum: ] Snapchat Publisher",martinSelected);

    }
}
