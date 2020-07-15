package adrianromanski.head_first.command.remote;

import adrianromanski.head_first.command.remote.light.Light;
import adrianromanski.head_first.command.remote.light.LightOffCommand;
import adrianromanski.head_first.command.remote.light.LightOnCommand;
import adrianromanski.head_first.command.remote.macro.MacroCommand;
import adrianromanski.head_first.command.remote.tv.TV;
import adrianromanski.head_first.command.remote.tv.TVOffCommand;
import adrianromanski.head_first.command.remote.tv.TVOnCommand;

import java.util.Arrays;
import java.util.List;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        // Lights
        Light bedroomLight = new Light("Bedroom");
        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);

        Light kitchenLight = new Light("Kitchen");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // Television
        TV bedroomTV = new TV("Bedroom");
        TVOnCommand bedroomTVOn = new TVOnCommand(bedroomTV);
        TVOffCommand bedroomTVOff = new TVOffCommand(bedroomTV);

        TV restroomTV = new TV("Restroom");
        TVOnCommand restroomTVOn = new TVOnCommand(restroomTV);
        TVOffCommand restroomTVOff = new TVOffCommand(restroomTV);

        // Macros
        MacroCommand bedroomPartyOn = new MacroCommand(Arrays.asList(bedroomLightOn, bedroomTVOn));
        MacroCommand  bedroomPartyOff = new MacroCommand(Arrays.asList(bedroomLightOff, bedroomTVOff));


        // Lights
        remoteControl.setCommand(0, bedroomLightOn, bedroomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        // TV
        remoteControl.setCommand(2, bedroomTVOn, bedroomTVOff);
        remoteControl.setCommand(3, restroomTVOn, restroomTVOff);

        // Macros
        remoteControl.setCommand(4, bedroomPartyOn, bedroomPartyOff);

        System.out.println("Button 0");
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println("Button 1");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        System.out.println("Button 2");
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        System.out.println("Button 3");
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println("Button 4");
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);




    }
}
