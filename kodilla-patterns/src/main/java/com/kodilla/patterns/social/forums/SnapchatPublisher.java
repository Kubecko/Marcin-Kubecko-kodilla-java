package com.kodilla.patterns.social.forums;

import com.kodilla.patterns.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "[ I use a social forum: ] Snapchat Publisher";
    }
}
