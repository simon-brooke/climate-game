# The Climate Game

## Introduction

The Climate Game is game about avoiding climate catastrophe.

## Motivation and concept

The primary concerns I have which are driving this project is we're failing to communicate, even to the young but certainly to the old, just how intractable and serious the climate emergency is; that we lack critical infrastructure for a survivable planet; and that, unless we get the management of strategic materials right, it will be impossible to build the infrastructure for a survivable planet without tipping the climate system over the edge into utter catastrophe.

To illustrate what I mean here: we presently have some capacity to smelt steel by electric arc. We currently have some renewable electricity generation plant. But the amount of steel we can actually make using only renewable energy is quite limited. If we use that limited 'green' steel to make new renewable electricity generation plant and new electric arc steelworks, then we can increase the amount of 'green' steel we can make, and gradually we can build other 'green' infrastructure. But if we use that 'green' steel to make things which aren't actually on the critical path, like electric cars, we're going to be stuffed.

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

It's likely that the climate model used will be based on Ben Matthews' [Java Climate Model](https://jcm.climatemodel.info/), but I haven't yet had confirmation from Ben that he is happy for me to use it.

### Economy model

The economy model needs to track the production and consumption of strategic materials including energy, timber, metals, food, and record (and report to the climate model) the total amount of carbon released. It's likely that the economy model will be entirely custom.







