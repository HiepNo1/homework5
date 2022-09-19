package datetimehandle.homework;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeNow21 {
    public static void main(String[] args) {
        ZonedDateTime zoneVN = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Thời gian ở Việt Nam : " + zoneVN);
        ZonedDateTime zoneDarwin = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Australia/Darwin"));
        System.out.println("Thời gian ở Darwin : " + zoneDarwin);
        ZonedDateTime zoneSydney = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Australia/Sydney"));
        System.out.println("Thời gian ở Sydney : " + zoneSydney);
        ZonedDateTime zoneBuenos_Aires = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Argentina/Buenos_Aires"));
        System.out.println("Thời gian ở Buenos_Aires : " + zoneBuenos_Aires);
        ZonedDateTime zoneCairo = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Africa/Cairo"));
        System.out.println("Thời gian ở Cairo : " + zoneCairo);
        ZonedDateTime zoneAnchorage = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Anchorage"));
        System.out.println("Thời gian ở Anchorage : " + zoneAnchorage);
        ZonedDateTime zoneSao_Paulo = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Thời gian ở Sao_Paulo : " + zoneSao_Paulo);
        ZonedDateTime zoneDhaka = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Dhaka"));
        System.out.println("Thời gian ở Dhaka : " + zoneDhaka);
        ZonedDateTime zoneHarare = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Africa/Harare"));
        System.out.println("Thời gian ở Harare : " + zoneHarare);
        ZonedDateTime zoneSt_Johns = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/St_Johns"));
        System.out.println("Thời gian ở St_Johns : " + zoneSt_Johns);
        ZonedDateTime zoneChicago = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/Chicago"));
        System.out.println("Thời gian ở Chicago : " + zoneChicago);
        ZonedDateTime zoneShanghai = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Asia/Shanghai"));
        System.out.println("Thời gian ở Shanghai : " + zoneShanghai);
        ZonedDateTime zoneAddis_Ababa = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Africa/Addis_Ababa"));
        System.out.println("Thời gian ở Addis_Ababa : " + zoneAddis_Ababa);
        ZonedDateTime zoneParis = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("Europe/Paris"));
        System.out.println("Thời gian ở Paris : " + zoneParis);
    }
}
