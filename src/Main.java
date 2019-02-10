import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Teammate teammate1 = new Teammate("Frodo", true);
        Teammate teammate2 = new Teammate("Gandalf", false);
        Teammate teammate3 = new Teammate("Aragorn", false);
        Teammate teammate4 = new Teammate("Legolas", false);
        Teammate teammate5 = new Teammate("Gimli", false);

        List<Teammate> teammateList = new ArrayList<>();
        teammateList.add(teammate1);
        teammateList.add(teammate2);
        teammateList.add(teammate3);
        teammateList.add(teammate4);
        teammateList.add(teammate5);

        List<Teammate> collect = teammateList.
                stream().
                filter(p -> !p.isHasRing()).
                collect(Collectors.toList());

        collect.forEach(System.out::println);

        List<Teammate> modifiedList = teammateList.
                stream().
                map(p -> {
                            if (p.isHasRing()) {
                                p.setName(p.getName() + " has the ring");
                            } else p.setName(p.getName() + " has not the ring");
                            return p;
                        }
                ).
                collect(Collectors.toList());
        modifiedList.forEach(p -> System.out.println(p));

        System.out.println();

        List<Teammate> value = teammateList.stream().
                filter(p -> p.getName().toLowerCase().contains("f")).
                collect(Collectors.toList());

        value.forEach(p -> System.out.println(p));


        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        LocalTime localTime  = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getMinute());

    }
}
