# Java-Styles
It is a series of styles applied to improve the visual environment of the components (inputs and buttons)

**JPasswordPlaceHolderRound**
How to add the button

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

