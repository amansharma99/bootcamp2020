package Java8;
interface inter {
    customstring aman(char[] chars);
}
    class customstring {
        String str;

        public customstring(char[] chars) {
            str = new String(chars);
        }

        @Override
        public String toString() {
            return str;
        }

        public static void main(String[] args) {
            char[] chars = {'a', 'b', 'c', 'd'};
            inter i = customstring::new;
            System.out.println(i.aman(chars));
        }
    }
