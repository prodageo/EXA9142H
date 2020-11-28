package japicmp.config;

import java.util.regex.Pattern;

public class PackageFilter {
    private final Pattern pattern;

    public PackageFilter(String packageName) {
        String regEx = packageName.replace(".", "\\.");
        regEx = regEx.replace("*", ".*");
        regEx = regEx + "(\\.[^\\.]+)*";
        pattern = Pattern.compile(regEx);
    }

    public boolean matches(String str) {
        return pattern.matcher(str).matches();
    }
}
