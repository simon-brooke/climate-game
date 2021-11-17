# climate-game

A game about avoiding climate catastrophe.

## Motivation and concept

The primary concerns I have which are driving this project is we're failing to communicate, even to the young but certainly to the old, just how intractable and serious the climate emergency is; that we lack critical infrastructure for a survivable planet; and that, unless we get the management of strategic materials right, it will be impossible to build the infrastructure for a survivable planet without tipping the climate system over the edge into utter catastrophe.

To illistrate what I mean here: we presently have some capacity to smelt steel by electric arc. We currently have some renewable electricity generation plant. But the amount of steel we can actually make using only renewable energy is very limited. If we use that limited 'green' steel to make new renewable electricity generation plant and new electric arc steelworks, then we can increase the amount of 'green' steel we can make, and gradually we can build other 'green' infrastructure. But if we use that 'green' steel to make things which aren't actually on the critical path, like electric cars, we're going to be stuffed.

So the concept here is something between a sim and a god-game. The player will play as government of one of a number of playable territories, on a recognisable model of planet Earth as it is now. As the government, the player can

1. Raise taxes on a number of things;
2. Build infrastructure using available materials;
3. Ban certain things;
4. Provide social benefits;
5. Put down revolts by force;
6. Engage in diplomacy with other governments;
7. Engage in war with other governments.

The government does not control the population directly, but only indirectly. If you tax too much and ban too much, your population will revolt. If you allow the climate to warm too much, then climate consequences will also cause your population to revolt.

## Major components

### Climate model

The core of the game needs to be a reasonably good climate model backed by good science. Obviously, this doesn't need to be (and can't be) as sophisticated as climate models used to do real climate science, since it needs to run on a domestic PC or games console and leave enough processor cycles free for a user interface and an economy model, but it has to produce results which are scientifically defensible.

I think the climate model needs to run in its own thread, separate from the main game loop. It needs to update maps for temperature, rainfall and windspeed on a regular basis, and also track things like total atmospheric carbon, anthropogenic warming, and sea level rise.

### Economy model

The economy model needs to track the production and consumption of strategic materials including energy, timber, metals, food, and record (and report to the climate model) the total amount of carbon released.

### User Interface

The user interface needs to be a (possibly stylised, but recognisable) map or the world over which the user can pan and zoom to look at what's going on in different places. Cities, industries, transport corridors and so on need to be visible and inspectable.

I like the idea of having little people running around getting on with their lives, perhaps one for every million people in the real world, but that's pretty ambitious and perhaps a step too far.

### User interface

## Warning

At this stage nothing works. This isn't even a skeleton of a working game; it's a repository in which to develop a specification, and from that a skeleton.

## Policy on collaboration and forking

I'm much better at starting projects than finishing them. It would be far better if there were half a dozen slightly different more or less playable variants of this game than if there were none. It would, obviously, be better still if there were just one, more or less finished, reasonably polished version. But in general my policy is that you are free to, and encouraged to, fork this code. I'd appreciate it if you would communicate with me, and occasionally push me merge requests, but...

## Usage

Doesn't work yet. In future it will be something like

    $ java -jar climate-game-0.1.0-standalone.jar [args]


## License

Copyright © 2021 Simon Brooke

This program and the accompanying materials are made available under the
GNU General Public License as published by the Free Software Foundation, 
either version 2 of the License, or (at your option) any later version, 
with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
