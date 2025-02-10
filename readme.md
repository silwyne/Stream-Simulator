# Stream-Simulator

## Introduction
Scenario of this project is to make a Framework for simulating DataStreams.\
For some reason like easier development and debug of the code and the data flow
data engineers may want to simulate their input data to have easier functionality tests of their data pipeline.

## Architecture
As we know in data world, data doesn't just exist!\
But get generated as events happen or people do things. So Data gets generated in order to logical historical events.
If we call event generators, units we will spawn so many units to produce events for us.
And in the second phase after event generation we will use those events to generate our data.

## Idea
- we want to reach 1 million data per second
- we have to use complex concurrent architecture to make this possible
- if user introduces large datasets and inputs we have to make sure we manage proper memory usage

## Components
- **Units**
  - let's make sure each unit is not a separated thread
  - There should be no limitation to unit number
  - User defines Unit once and spawns as many as desired

That's all I can think about for now!