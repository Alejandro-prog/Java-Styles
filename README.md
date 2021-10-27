[![Downloads](https://img.shields.io/npm/dm/eslint.svg)](2) 

# Java-Styles
It is a series of styles applied to improve the visual environment of the components (inputs and buttons)

**JPasswordPlaceHolderRound**

- How to add the field

```	
    import style.JPasswordPlaceHolderRound;
    public JPasswordPlaceHolderRound password;


    password = new JPasswordPlaceHolderRound(15);
    password.setBounds(90, 220, 170, 33);
    password.setHorizontalAlignment(SwingConstants.LEFT);
    password.setBorderPainted(false);
    password.setForeground(Color.white);
    password.setPhColor(new Color(255, 255, 255, 90));
    password.setPlaceholder("Password");
    password.setOpaque(false);
    add(password);
```

**JTextPlaceHolderRound**

- How to add the field

```	
    import style.JTextPlaceHolderRound;
    public JTextPlaceHolderRound name;

    name = new JTextPlaceHolderRound(15);
    name.setBounds(90, 170, 170, 33);
    name.setHorizontalAlignment(SwingConstants.LEFT);
    name.setBorderPainted(false);
    name.setForeground(Color.white);
    name.setPhColor(new Color(255, 255, 255, 90));
    name.setOpaque(false);
    name.setPlaceholder("Users Name");
    add(name);
```
