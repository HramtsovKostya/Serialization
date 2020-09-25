package person;

public enum Gender {
    MALE, FEMALE, NONE;

    @Override
    public String toString() {
        return switch (this) {
            case MALE -> "мужской";
            case FEMALE -> "женский";
            case NONE -> "неизвестно";
        };
    }
}