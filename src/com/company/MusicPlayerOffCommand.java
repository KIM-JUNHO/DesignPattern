package com.company;

public class MusicPlayerOffCommand implements Command {
    MusicPlayer musicPlayer;

    public MusicPlayerOffCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.off();
    }
}
