class Solution {
    public int numUniqueEmails(String[] emails) {
        Map<String, List<String>> map = new HashMap<>();

        for (String email : emails) {
            String[] splitEmail = email.split("@");
            String localName = splitEmail[0];
            String domainName = splitEmail[1];

            if(localName.contains("+")) {
                int indexOfPlus = localName.indexOf("+");

                localName = localName.substring(0, indexOfPlus);
            }
            localName = localName.replace(".", "");

            String normalizedEmail = localName + "@" + domainName;

           if (!map.containsKey(normalizedEmail)) {
                map.put(normalizedEmail, new ArrayList<>());
            }
            map.get(normalizedEmail).add(email);
        }
        return map.size();
    }
}