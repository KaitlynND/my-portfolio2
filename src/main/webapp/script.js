// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['I play viola and trumpet! I have played the viola since the 5th grade and trumpet since the 7th grade.'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
}

async function getDataServlet() {
  const message = await fetch('/data');
  const addDataToDOM = await message.text();
  document.getElementById('dataserve').innerText = addDataToDOM;

}

/**
 * Fetches stats from the servers and adds them to the DOM.
 */
/** function getJstring() {
  fetch('/data').then(response => response.json()).then((jstring) => {


   const message = document.getElementById('json');
    message.innerHTML = '';
    });*/

async function getJstring() {
  const message = await fetch('/data');
  const jstring = await message.text();
  document.getElementById('json').innerText = jstring;

  async function getText() {
  const message = await fetch('/data');
  const text = await message.text();
  document.getElementById('test').innerText = text;

  


 function createListElement(text) {
 const liElement = document.createElement('li');
  liElement.innerText = text;
  return liElement; 
}

function loadTasks() {
  fetch('/data').then(response => response.json()).then((tasks) => {
    const taskListElement = document.getElementById('task-list');
    tasks.forEach((task) => {
      taskListElement.appendChild(createTaskElement(task));
    })
  });
}
function createMap() {
  const map = new google.maps.Map(
      document.getElementById('map'),
      {center: {lat: 37.422, lng: -122.084}, zoom: 16});
}


}}