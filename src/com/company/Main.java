package com.company;

public class Main {

    public static void main(String[] args) {
        MultipleRemoteControl remote = new MultipleRemoteControl();

        //리시버 및 커맨드 객체 생성
        Light livingLight = new Light("거실");
        LightOnCommand livingLightOn = new LightOnCommand(livingLight);
        LightOffCommand livingLightOff = new LightOffCommand(livingLight);

        Light kitchenLight = new Light("부엌");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerOnCommand musicPlayerOnCommand = new MusicPlayerOnCommand(musicPlayer);
        MusicPlayerOffCommand musicPlayerOffCommand = new MusicPlayerOffCommand(musicPlayer);


        Command[] partyOn = {livingLightOn, kitchenLightOn, musicPlayerOnCommand};
        Command[] partyOff = {livingLightOff, kitchenLightOff, musicPlayerOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remote.setCommand(0, partyOnMacro, partyOffMacro);

        remote.onButtonPressed(0);
        remote.undoButtonPressed();
        remote.offButtonPressed(0);
    }
}
