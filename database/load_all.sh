#!/bin/sh

csvloader --separator "|" --skip 1 --file data/towns.txt towns
csvloader --file data/people.txt --skip 1 people
csvloader --skip 1 -f data/states.csv states
