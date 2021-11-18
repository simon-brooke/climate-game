# User Interface

## Planetary view

The primary user interface should be a view of the planet from space. Scrolling the mouse wheel in should zoom in (i.e. move the view point nearer to the ground); scrolling out should zoom out. The viewpoint is always straight down, and the planet is always centred in the screen. Holding the left mouse button down and dragging rotates the viewpoint around the planet. When the left button is released, the viewpoint should be geostationary (i.e. if you place it over Paris, it should remain over Paris).

If there is a day/night cycle, which I would like, that should be implemented by the sun rotating around the planet well outside the orbit of the viewpoint; the maximum 'zoom out' of the viewpoint should be within the orbit of the moon.

#### Objects

It's possible (i.e. I would like it) that as the view of the planet is zoomed in, objects become visible to be selected and inspected. Such objects might include

1. Towns and cities;
2. Factories, farms and power plants;
3. Roads and railways;
4. Ships and aeroplanes;
5. Homes;
6. Individual people, cars and bicycles.

Obviously it is not necessary for every town and city to be represented. Rather, for game purposes, North America might have three cities, roughly New York, Chicago, Los Angeles; it might have about 400 actual instantiated people. This is enough to give a representative view of economic activity without excessive clutter.

## Inspectors

Right-clicking on objects on the planet should bring up inspector panel giving key data on the particular object. The initial presentation of the inspector panel should be a small box taking up not more than about 16% of the screen area, but if the object is complex with lots of data to display it should be possible to toggle it to full screen. It should also be possible to dismiss inspectors. Controls to toggle full screen, and to dismiss, may be conventional window title bar controls.

### Desirable behaviour

When not toggled to full screen the inspector should be positioned just to the right of the object being inspected. It should maintain this relationship to the object being inspected as the planet is rotated, even if this means the inspector being partially or wholly removed from the screen.

This implies to me that inspector panels, when not toggled full screen, should not be drawn in the plane of the screen but rather should be drawn at an altitude of about one kilometre over the object being inspected. They should always be parallel to the plane of the screen, but if the planet is rotated so that the object being inspected is on the far side of the planet, then the inspector should be partially or entirely behind the planet. This also implies that, as the viewpoint is zoomed in and out, the inspector panels should scale, and that when the viewpoint is zoomed out to show the whole planet, inspector panels should be pretty much unreadable.

Double clicking on an open inspector should rotate and zoom the view to place the object inspected left centre of the screen, with the inspector itself right centre of the screen and clearly readable.

## Alerts

When events happen which to which the player may want to respond should be presented as alerts. Such events include

1. Floods;
2. Forest fires;
3. Extreme heat events;
4. Crop failures;
5. Military action by other players.

Alerts should be presented similarly to inspectors, except that they open automatically, and have some different styling (e.g. background colour). Because alerts may relate to events off-screen, in addition to popping up the panel to the right of the location of the event, there should be a pulldown menu at e.g. top right of the screen showing all current alerts, which should flash or otherwise draw attention when there are new alerts which have not yet been acknowledged by the user. 

Selecting an alert from the drop down menu will rotate and zoom the planet to place the location of the event left centre on the screen and the alert itself right centre. It may be possible to interact with the alert e.g. to allocate aid/send rescue workers. If you allocate aid/send rescuers to an event in another player's territory that will generally be interpreted as a friendly diplomatic move.

Alerts automatically disappear after the related event has ended, but will not disappear while currently focussed.

## Modes

As well as viewing what is going on on the planet currently, users need to interact with the model in other ways. This requires modal changes to the user interface. Modes will br presented as trays which can be dragged in from the left hand side of the screen. For each available mode, there should be a permanent handle, which should be at the left of the screen for 'closed' trays and at the right of the screen for 'open' trays. One open tray is always topmost, and its handle should be highlighted in some way, probably with colour.

### Taxation mode

Taxation mode allows the player to view and modify tax and tariff rates for your own territory. You may apply taxes to

1. income;
2. Wealth;
3. Property;

Taxation should not be a fixed rate (i.e. not all income should be taxed at 25%); rather it should be expressed as a formula so that each tax has a 'floor' below which tax is not levied, and a progressive slope so that e.g. people with larger incomes can be levied proportionally more tax.

Tariffs can be levied on any of the [Strategic Materials], at a fixed percentage of the value. 

### Diplomacy mode

Diplomacy mode allows the player to interact with other players, either actual woman players or algorithmic players. The exact details of this need further thought.

### History mode

History mode essentially allows the player to view a log of events which have happened so far this run.

### Statistics mode

Statistics mode allows the player to inspect a broad range of statistics about the current state of the model.