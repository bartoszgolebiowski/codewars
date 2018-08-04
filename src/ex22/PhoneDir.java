package ex22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDir {
    public static String phone(String input, String phoneNumber) {
        String[] records = input.split("\n");
        List<String> list = Arrays.stream(records).filter(o1 -> o1.contains(phoneNumber)).collect(Collectors.toList());

        if(list.size()==0) return "Error => Not found: "+phoneNumber;
        if(list.size()!=1) return "Error => Too many people: "+phoneNumber;
        String singleRecord = list.get(0);
        String name = singleRecord.split("<|>")[1];
        String address = singleRecord
                .replace(name, "")
                .replace(phoneNumber, "")
                .replaceAll("[^A-Za-z0-9\\. -]", " ")
                .replaceAll(" +", " ")
                .trim();

        return "Phone => " + phoneNumber + ", Name => " + name + ", Address => " + address;
    }
}
