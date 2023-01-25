public class Main {
    public static void main(String[] args) {

        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else
            min = mishaAge;

        boolean minVasyaAge = vasyaAge >= katyaAge && vasyaAge <= mishaAge || vasyaAge <= katyaAge && vasyaAge >= mishaAge;
        boolean minKatyaAge = katyaAge >= vasyaAge && katyaAge <= mishaAge || katyaAge <= vasyaAge && katyaAge >= mishaAge;

        if (minVasyaAge) {
            middle = vasyaAge;
        } else if (minKatyaAge) {
            middle = katyaAge;
        } else
            middle = mishaAge;

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else
            max = mishaAge;

        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);
    }

}
