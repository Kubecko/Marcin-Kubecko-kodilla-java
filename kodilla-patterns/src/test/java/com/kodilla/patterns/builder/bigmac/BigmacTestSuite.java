package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll with sesame seeds")
                .burgers(2)
                .sauce("1000 isle")
                .ingredients("lettuce")
                .ingredients("bacon")
                .ingredients("cheese")
                .ingredients("onion")
                .ingredients("cucumber")
                .ingredients("chili peppers")
                .ingredients("mushrooms")
                .ingredients("shrimp")
                .build();
        System.out.println(bigmac);
        //When
        int showMyBimacbigmac = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(8,showMyBimacbigmac);
    }
}
