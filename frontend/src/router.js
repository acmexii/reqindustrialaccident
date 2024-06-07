
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AccidentAccidentManager from "./components/listers/AccidentAccidentCards"
import AccidentAccidentDetail from "./components/listers/AccidentAccidentDetail"

import AssessmentAssessmentManager from "./components/listers/AssessmentAssessmentCards"
import AssessmentAssessmentDetail from "./components/listers/AssessmentAssessmentDetail"
import AssessmentSickLeaveManager from "./components/listers/AssessmentSickLeaveCards"
import AssessmentSickLeaveDetail from "./components/listers/AssessmentSickLeaveDetail"

import CompensationCompensationManager from "./components/listers/CompensationCompensationCards"
import CompensationCompensationDetail from "./components/listers/CompensationCompensationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/accidents/accidents',
                name: 'AccidentAccidentManager',
                component: AccidentAccidentManager
            },
            {
                path: '/accidents/accidents/:id',
                name: 'AccidentAccidentDetail',
                component: AccidentAccidentDetail
            },

            {
                path: '/assessments/assessments',
                name: 'AssessmentAssessmentManager',
                component: AssessmentAssessmentManager
            },
            {
                path: '/assessments/assessments/:id',
                name: 'AssessmentAssessmentDetail',
                component: AssessmentAssessmentDetail
            },
            {
                path: '/assessments/sickLeaves',
                name: 'AssessmentSickLeaveManager',
                component: AssessmentSickLeaveManager
            },
            {
                path: '/assessments/sickLeaves/:id',
                name: 'AssessmentSickLeaveDetail',
                component: AssessmentSickLeaveDetail
            },

            {
                path: '/compensations/compensations',
                name: 'CompensationCompensationManager',
                component: CompensationCompensationManager
            },
            {
                path: '/compensations/compensations/:id',
                name: 'CompensationCompensationDetail',
                component: CompensationCompensationDetail
            },



    ]
})
